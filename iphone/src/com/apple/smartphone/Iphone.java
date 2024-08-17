package com.apple.smartphone;
import com.apple.navegador.NavegadorInternet;
import com.apple.reprodudorMusical.ReprodutorMusical;
import com.apple.telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA: " + musica);
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("NOVA ABA ADICIONADA");
    }

    public void atualizarPagina() {
        System.out.println("PÁGINA ATUALIZADA");
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA O NÚMERO: " + numero);
    }

    public void atender() {
        System.out.println("ATENDENDO");
    }

    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ INICIADO");
    }

}
