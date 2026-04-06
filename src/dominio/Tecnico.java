package dominio;

import java.time.LocalDate;

public class Tecnico extends Funcionario{
    private String setor;


    public Tecnico(String nome, String cpf, LocalDate nascimento, String endereco, String matricula, float salario, String setor) {
        super(nome, cpf, nascimento, endereco, matricula, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    @Override
    public float calcularSalario(float salario){
        return salario * 10;
    }
}
