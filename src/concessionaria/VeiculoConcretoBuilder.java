package concessionaria;

class VeiculoConcretoBuilder implements VeiculoBuilder {
    private Veiculo veiculo;

    public VeiculoConcretoBuilder() {
        veiculo = new Veiculo();
    }

    @Override
    public void setModelo(String modelo) {
        veiculo.setModelo(modelo);
    }

    @Override
    public void setMotor(String motor) {
        veiculo.setMotor(motor);
    }

    @Override
    public void setCor(String cor) {
        veiculo.setCor(cor);
    }

    @Override
    public void addAcessorio(String acessorio) {
        veiculo.addAcessorio(acessorio);
    }

    @Override
    public Veiculo getVeiculo() {
        return veiculo;
    }
}