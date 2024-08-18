package org.iphone;

import org.iphone.controller.Iphone;

public class App {
    public static void main(String[] args) {

        Iphone meuIphone = new Iphone();

        meuIphone.tocar();
        meuIphone.selecionarMusica("Paradise");
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioDeVoz();

        meuIphone.exibirPagina("https://www.youtube.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}