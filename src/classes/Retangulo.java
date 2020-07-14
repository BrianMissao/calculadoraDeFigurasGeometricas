package classes;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return ((largura * 2) + (altura * 2));
    }

    public double calcularDiagonal() {
        double diagonal;
        double quadradoDaLargura = Math.pow(largura, 2);
        double quadradoDaAltura = Math.pow(altura, 2);
        double somaDosQuadrados = (quadradoDaLargura + quadradoDaAltura);
        diagonal = Math.sqrt(somaDosQuadrados);
        return diagonal;
    }
}
