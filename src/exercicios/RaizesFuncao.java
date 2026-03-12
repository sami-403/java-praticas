package exercicios;

import java.util.Scanner;
public class RaizesFuncao {
    static double delta(double a, double b, double c) {
        if (a <= 0) return 0;
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }
    static double primeiraRaiz(double a, double b, double c) {
        double deltaResultado = delta(a, b, c);
        double deltaRaiz = Math.sqrt(deltaResultado);
        double dobroA = a*2;
        return ((b * -1) + deltaRaiz) / dobroA;
    }
    static double segundaRaiz(double a, double b, double c) {
        double deltaResultado = delta(a, b, c);
        double deltaRaiz = Math.sqrt(deltaResultado);
        double dobroA = a*2;
        return ((b * -1) - deltaRaiz) / dobroA;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valo de A: ");
        double a = scanner.nextDouble();
        System.out.println("Digite o valo de B: ");
        double b = scanner.nextDouble();
        System.out.println("Digite o valo de C: ");
        double c = scanner.nextDouble();

        if (a < 0) {
            System.out.println("A raiz não eh real.");
        }
        double resultadoPrimeiraRaiz = primeiraRaiz(a, b, c);
        double resultadoSegundaRaiz = segundaRaiz(a, b, c);

        System.out.println("X1: " + resultadoPrimeiraRaiz);
        System.out.println(" X2: " + resultadoSegundaRaiz);

    }

}
