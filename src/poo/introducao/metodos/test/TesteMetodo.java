package poo.introducao.metodos.test;

import poo.introducao.metodos.dominio.Calculadora;

public class TesteMetodo {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somaDoisNumeros(4,4));
    }
}
