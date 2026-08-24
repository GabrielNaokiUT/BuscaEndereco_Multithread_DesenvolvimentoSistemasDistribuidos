package com.busca;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ViaCepAPI {

    public static Endereco buscarEndereco(String cep) throws Exception { //Método que busca o endereço na API ViaCEP
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection(); //Conexão HTTP Get
        connection.setRequestMethod("GET");

        Scanner scanner = new Scanner(connection.getInputStream()); //Leitura da resposta da API
        String resposta = scanner.useDelimiter("\\A").next(); 
        scanner.close();

        Endereco endereco = new Endereco(); //Cria um objeto Endereco para armazenar os dados retornados pela API
        endereco.setCEP(extrairValor(resposta, "cep"));
        endereco.setLogradouro(extrairValor(resposta, "logradouro"));
        endereco.setComplemento(extrairValor(resposta, "complemento"));
        endereco.setBairro(extrairValor(resposta, "bairro"));
        endereco.setLocalidade(extrairValor(resposta, "localidade"));
        endereco.setUF(extrairValor(resposta, "uf"));
        endereco.setEstado(extrairValor(resposta, "estado"));
        endereco.setRegiao(extrairValor(resposta, "regiao"));
        endereco.setIbge(extrairValor(resposta, "ibge"));
        endereco.setGia(extrairValor(resposta, "gia"));
        endereco.setDdd(extrairValor(resposta, "ddd"));
        endereco.setSiafi(extrairValor(resposta, "siafi"));

        return endereco;
    }

    private static String extrairValor(String json, String chave) { // Método auxiliar para extrair valores do JSON retornado pela API
        String busca = "\"" + chave + "\":";
        int inicio = json.indexOf(busca);

        if (inicio == -1) {
            return "";
        }

        inicio += busca.length();

        while (inicio < json.length() && (json.charAt(inicio) == ' ' || json.charAt(inicio) == '"')) {
            if (json.charAt(inicio) == '"') {
                inicio++;
                break;
            }
            inicio++;
        }

        int fim = json.indexOf("\"", inicio);

        if (fim == -1) {
            return "";
        }

        return json.substring(inicio, fim); // Retorna o valor extraído do JSON
    }
}