package dominio;

import java.time.LocalDate;

public class Professor extends Funcionario{
    private String curso;
    private Titularidade titularidade;

    public Professor(String nome, String cpf, LocalDate nascimento, String endereco, String matricula, float salario, String curso, Titularidade titularidade) {
        super(nome, cpf, nascimento, endereco, matricula, salario);
        this.curso = curso;
        this.titularidade = titularidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Titularidade getTitularidade() {
        return titularidade;
    }

    public void setTitularidade(Titularidade titularidade) {
        this.titularidade = titularidade;
    }

    @Override
    public float calcularSalario(){
        float salario = getSalario();
        if(getTitularidade() == Titularidade.DOUTOR){
            return salario
        }
    }
}
