package concessionaria;

import java.util.List;

class Diretor {
    private VeiculoBuilder builder;

    public Diretor(VeiculoBuilder builder) {
        this.builder = builder;
    }

    public void construirVeiculo(String modelo, String motor, String cor, List<String> acessorios) {
        builder.setModelo(modelo);
        builder.setMotor(motor);
        builder.setCor(cor);
        for (String acessorio : acessorios) {
            builder.addAcessorio(acessorio);
        }
    }

    public Veiculo getVeiculo() {
        return builder.getVeiculo();
    }
}