package com.company;

public class Dau {
    int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Dau{" +
                "valor=" + valor +
                '}';
    }

    public void tirar(){
        valor = (int)((Math.random() * 6) + 1);
    }
}
