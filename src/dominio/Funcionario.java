package dominio;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa{
    private String matricula;
    private float salario;

    public Funcionario(String nome, String cpf, LocalDate nascimento, String endereco, String matricula, float salario) {
        super(nome, cpf, nascimento, endereco);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract float calcularSalario(float salario);

    public abstract float calcularSalario();
}
