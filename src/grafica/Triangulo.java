package grafica;

class Triangulo implements Forma {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public Forma clone() {
        return new Triangulo(this.base, this.altura);
    }
}