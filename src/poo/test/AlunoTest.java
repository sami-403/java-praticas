package poo.test;

import poo.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Lucas";
        aluno.sexo = "M";
        aluno.matricula = "2024040012";
        aluno.turma = "3A";
        aluno.idade = 18;

        System.out.printf("Olá, %s, bem vindo, sua matricula eh: %s e voce eh da turma: %s\n", aluno.nome, aluno.matricula, aluno.turma);

    }
}
