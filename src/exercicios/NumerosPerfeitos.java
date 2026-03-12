package exercicios;

import java.util.Scanner;
public class NumerosPerfeitos {
    static boolean isPerfect(int num) {
        int count = 0;
        for (int i = 1; i <= num - 1; i++) {
            if (num % i == 0) {
                count = count + i;
            }

        }
       return count == num;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite um numero: \n");
        int num = input.nextInt();

        System.out.println(isPerfect(num));

    }
}