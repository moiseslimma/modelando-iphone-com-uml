package com.iphoneproject.navegador;

public interface NavegadorInternet {

    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
    void voltarPagina();
    void avancarPagina();
}
