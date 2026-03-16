package exercicios;

import java.util.Scanner;

public class SenhaUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "roblox123";
        String senhaUser = sc.next();

        System.out.println(senhaUser.equals(senha));
    }
}
