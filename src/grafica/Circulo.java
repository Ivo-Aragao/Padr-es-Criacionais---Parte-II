package grafica;

class Circulo implements Forma {
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    @Override
    public Forma clone() {
        return new Circulo(this.raio);
    }
}