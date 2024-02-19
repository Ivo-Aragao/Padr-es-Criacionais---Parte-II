package grafica;

public class Main {
    public static void main(String[] args) {
        EditorGrafico editor = new EditorGrafico();

        Circulo circulo = new Circulo(5);
        Forma circuloDuplicado = editor.duplicarForma(circulo);
        System.out.println("Circulo duplicado: " + circuloDuplicado);

        Retangulo retangulo = new Retangulo(4, 6);
        Forma retanguloDuplicado = editor.duplicarForma(retangulo);
        System.out.println("Retangulo duplicado: " + retanguloDuplicado);

        Triangulo triangulo = new Triangulo(3, 4);
        Forma trianguloDuplicado = editor.duplicarForma(triangulo);
        System.out.println("Triangulo duplicado: " + trianguloDuplicado);
    }
}