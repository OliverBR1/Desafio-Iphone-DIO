package org.iphone.controller;

import org.iphone.repository.NavegadorWeb;
import org.iphone.repository.ReprodutorMusical;
import org.iphone.repository.Telefone;
import org.iphone.service.NavegadorWebService;
import org.iphone.service.ReprodutorMusicalService;
import org.iphone.service.TelefoneService;

public class Iphone implements ReprodutorMusical, Telefone, NavegadorWeb {

    private final ReprodutorMusical reprodutorMusical;
    private final Telefone telefone;
    private final NavegadorWeb navegadorWeb;

    public Iphone() {
        this.reprodutorMusical = new ReprodutorMusicalService();
        this.telefone = new TelefoneService();
        this.navegadorWeb = new NavegadorWebService();
    }


    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar(){
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica){
        reprodutorMusical.selecionarMusica(musica);
    }

    @Override
    public void ligar(String numero){
        telefone.ligar(numero);
    }

    @Override
    public void atender(){
        telefone.atender();
    }

    @Override
    public void iniciarCorreioDeVoz(){
        telefone.iniciarCorreioDeVoz();
    }

    @Override
    public void exibirPagina(String url){
        navegadorWeb.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegadorWeb.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorWeb.atualizarPagina();
    }
 }
