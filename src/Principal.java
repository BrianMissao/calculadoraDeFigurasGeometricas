import classes.Retangulo;

import java.util.Scanner;

public class Principal {
    private static Scanner scanner = new Scanner(System.in);
    private static Retangulo retangulo;

    public static void main(String[] args) {
        double largura = obterDados("Entre com a largura do retângulo:");
        double altura = obterDados("Entre com a altura do retângulo:");
        retangulo = new Retangulo(largura, altura);
        System.out.printf("Área do retângulo: %.2f%nPerímetro: %.2f%nDiagonal: %.2f", retangulo.calcularArea(), retangulo.calcularPerimetro(), retangulo.calcularDiagonal());
    }

    private static double obterDados(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextDouble();
    }
}
