package concessionaria;

import java.util.ArrayList;
import java.util.List;

class Veiculo {
    private String modelo;
    private String motor;
    private String cor;
    private List<String> acessorios;

    public Veiculo() {
        acessorios = new ArrayList<>();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void addAcessorio(String acessorio) {
        acessorios.add(acessorio);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", cor='" + cor + '\'' +
                ", acessorios=" + acessorios +
                '}';
    }
}