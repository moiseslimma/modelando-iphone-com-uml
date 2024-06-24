package com.iphoneproject.model;

import com.iphoneproject.aparelhoTelefonico.AparelhoTelefonico;
import com.iphoneproject.dispositivoApple.DispositivoApple;
import com.iphoneproject.navegador.NavegadorInternet;
import com.iphoneproject.playerDeMusica.ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class Iphone extends DispositivoApple implements NavegadorInternet, ReprodutorMusical, AparelhoTelefonico {

    private String url;
    private List<String> historico = new ArrayList<>();
    private int paginaAtualIndex = -1;

    public Iphone() {
    }

    public Iphone(String modelo, String sistemaOperacional) {
        super(modelo, sistemaOperacional);
    }

    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }
    @Override
    public void pausar() {
        System.out.println("Reprodução pausada");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println(musica + " selecionada");
    }


    @Override
    public void exibirPagina(String url) {
        System.out.println("Navegando para " + url);
        historico.add(url);
        paginaAtualIndex = historico.size() - 1;
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }
    @Override
    public void voltarPagina() {
        if (paginaAtualIndex > 0) {
            paginaAtualIndex--;
            System.out.println("Voltando para " + historico.get(paginaAtualIndex));
        }
        else {
            System.out.println("Não há páginas anteriores no histórico!");
        }
    }
    @Override
    public void avancarPagina() {
        if (paginaAtualIndex < historico.size() - 1) {
            paginaAtualIndex++;
            System.out.println("Avançando para " + historico.get(paginaAtualIndex));
        }
        else {
            System.out.println("Não há páginas no histórico!");
        }
    }


    @Override
    public void ligar(String numero) {
        System.out.println("Chamando " + numero);
    }
    @Override
    public void atender() {
        System.out.println("Chamada em andamento");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

}
