package poo.introducao.classes.test;

import poo.introducao.classes.dominio.Carro;

public class TestReferenciaObjetos {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Chevrolet";
        carro1.modelo = "Onix";
        carro1.ano = "2026";
        carro1.cor = "Verde";
        carro1.valor = 350000L;

        carro2.nome = "Argo";
        carro2.modelo = "Fiat";
        carro2.ano = "2026";
        carro2.cor = "Azul";
        carro2.valor = 680000L;

        carro1 = carro2;

        System.out.println(carro1.nome + " " + carro1.modelo);
    }
}
