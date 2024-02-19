package concessionaria;

interface VeiculoBuilder {
    void setModelo(String modelo);
    void setMotor(String motor);
    void setCor(String cor);
    void addAcessorio(String acessorio);
    Veiculo getVeiculo();
}