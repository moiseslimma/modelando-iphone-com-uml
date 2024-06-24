package com.iphoneproject.dispositivoApple;

public abstract class DispositivoApple {

    private String modelo;
    private String sistemaOperacional;

    public DispositivoApple() {
    }

    public DispositivoApple(String modelo, String sistemaOperacional) {
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
}
