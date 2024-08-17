package com.apple;

import com.apple.smartphone.Iphone;

public class usuario {
    public static void main(String[] args) {

        Iphone aparelho = new Iphone();

        aparelho.adicionarNovaAba();
        aparelho.exibirPagina("google.com");

        aparelho.selecionarMusica("wonderful world");
        aparelho.tocar();

        aparelho.ligar("81 9 9876-5432");
    }

}
