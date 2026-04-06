package dominio;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    private String curso;
    private String matricula;

    public Aluno(String nome, String cpf, LocalDate nascimento, String endereco, String curso, String matricula) {
        super(nome, cpf, nascimento, endereco);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
