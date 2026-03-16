package exercicios;

import java.util.Scanner;

public class FatorialRecursivo {
    static double fatorial(int numero){
        if (numero == 1){
            return 1;
        }
        return numero * fatorial(numero-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(fatorial(numero));
    }
}
