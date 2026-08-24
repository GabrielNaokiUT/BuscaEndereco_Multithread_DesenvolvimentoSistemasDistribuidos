package com.busca;

public class Endereco { // Classe que representa o endereço retornado pela API ViaCEP
    private String CEP;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String UF;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    public String getCEP() { //Getters
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

    public String getIbge() {
        return ibge;
    }

    public String getGia() {
        return gia;
    }

    public String getDdd() {
        return ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setCEP(String CEP) { //Setters
        this.CEP = CEP;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public void mostrarEndereco() { // Método que exibe o endereço no console
        System.out.println("\nCEP: " + CEP + 
                            "\nLogradouro: " + logradouro + 
                            "\nComplemento: " + complemento + 
                            "\nBairro: " + bairro + 
                            "\nLocalidade: " + localidade + 
                            "\nUF: " + UF + 
                            "\nEstado: " + estado + 
                            "\nRegião: " + regiao + 
                            "\nIBGE: " + ibge + 
                            "\nGIA: " + gia + 
                            "\nDDD: " + ddd + 
                            "\nSIAFI: " + siafi);
    }
}