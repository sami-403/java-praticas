package exercicios;

import java.util.Scanner;

public class SenhaUser {
    static boolean senhaValida(String senhaF, String senha) {
        return senhaF.equals(senha);
    }
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "roblox123";

        for( int i = 0; i < 3; i++ ) {
            String senhaUser = sc.next();
            if(senhaValida(senhaUser, senha)) {
                System.out.println("Senha correta! Bem vindo");
                break;
            }
            System.out.println("Senha incorreta!\n");
        }
        sc.close();
    }
}
