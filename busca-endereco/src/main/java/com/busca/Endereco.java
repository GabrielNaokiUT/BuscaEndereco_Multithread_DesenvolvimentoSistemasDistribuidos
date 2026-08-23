package com.busca;

public class Endereco {
    private String CEP;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String UF;
    private String estado;
    private String regiao;

    public String getCEP() {
        return CEP;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUF() {
        return UF;
    }

    public String getEstado() {
        return estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void mostrarEndereco() {
        System.out.println("\nCEP: " + CEP + 
                            "\nLogradouro: " + logradouro + 
                            "\nComplemento: " + complemento +
                            "\nBairro: " + bairro + 
                            "\nLocalidade: " + localidade + 
                            "\nUF: " + UF +
                            "\nEstado: " + estado + 
                            "\nRegião: " + regiao);
    }
}