package concessionaria;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        VeiculoBuilder builder = new VeiculoConcretoBuilder();

        Diretor diretor = new Diretor(builder);

        List<String> acessoriosCarroLuxo = new ArrayList<>();
        acessoriosCarroLuxo.add("Bancos de couro");
        acessoriosCarroLuxo.add("Power Dvd");
        acessoriosCarroLuxo.add("Vidro Fume");
        acessoriosCarroLuxo.add("Teto solar");

        diretor.construirVeiculo("Carro de Luxo", "V8", "Preto", acessoriosCarroLuxo);
        Veiculo carroDeLuxo = diretor.getVeiculo();
        System.out.println(carroDeLuxo);

        builder = new VeiculoConcretoBuilder();
        diretor = new Diretor(builder);

        List<String> acessoriosMotoEsportiva = new ArrayList<>();
        acessoriosMotoEsportiva.add("Cano Fortuna");
        acessoriosMotoEsportiva.add("Freio Abs");
        diretor.construirVeiculo("Moto Esportiva", "1000cc", "Vermelho", acessoriosMotoEsportiva);
        Veiculo motoEsportiva = diretor.getVeiculo();
        System.out.println(motoEsportiva);
    }
}