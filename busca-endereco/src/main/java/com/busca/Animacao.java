package com.busca;

// Classe que cria animação enquanto aguarda resposta da API
public class Animacao {
    private volatile boolean ativo = true; // Variável para controlar o estado da animação

    public void iniciar() { // Inicia a animação em uma thread separada
        new Thread(() -> {
            String[] frames = { ".", "-", ".", "-", ".", "-", ".", "-", "." }; //Animação ASCII
            int index = 0;

            while (ativo) {
                System.out.print("\r" + frames[index] + " Buscando endereço...");
                index = (index + 1) % frames.length;

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            System.out.print("\r                        \r");
        }).start();
    }

    public void parar() { // Para a animação
        ativo = false;
    }
}