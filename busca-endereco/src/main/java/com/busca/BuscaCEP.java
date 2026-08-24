package com.busca;

import java.util.Scanner;

public class BuscaCEP {  //Classe Main
    public static void main(String[] args) {
        String cep = null;

        if (args.length > 0) { // Se o CEP for fornecido como argumento de linha de comando, ele será usado diretamente
            cep = args[0].replaceAll("[^0-9]", "");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o CEP (apenas números): ");
            cep = scanner.nextLine().replaceAll("[^0-9]", "");
            scanner.close();
        }

        if (cep.length() != 8) { // Validação do CEP
            System.out.println("CEP INVÁLIDO!!! Deve conter 8 dígitos.");
            return;
        }

        try { // Bloco try-catch para lidar com possíveis exceções durante a busca do endereço
            Animacao animacao = new Animacao(); // Criação de um objeto Animacao para exibir uma animação durante a busca do endereço
            animacao.iniciar();

            Endereco endereco = ViaCepAPI.buscarEndereco(cep); // Chamada ao método buscarEndereco da classe ViaCepAPI para buscar o endereço 

            animacao.parar();

            if (endereco.getLogradouro() == null || endereco.getLogradouro().isEmpty()) { // Verificação se o logradouro retornado é nulo ou vazio, indicando que o CEP não foi encontrado
                System.out.println("ATENÇÃO!!! CEP não encontrado.");
            } else {
                System.out.println("Busca realizada com SUCESSO!!! Endereço encontrado: ");
                endereco.mostrarEndereco();
            }

        } catch (Exception e) { // Captura de exceções lançadas durante a busca do endereço e exibição de uma mensagem de erro
            System.out.println("ERRO!!! Busca falhou: " + e.getMessage());
        }
    }
}