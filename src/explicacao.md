# RELAÇÂO DE É-UM

```
Usamos o extends na classe a qual vamos herdar atributos de uma classe.

public class Professor "extends" Pessoa{
private String curso;
private String matricula;
private Float salario = 0.0F;
```

- **GENERALIZAÇÂO**
- **ESPECIALIZAÇÂO**

Num cenário que usamos uams classe generica para dá forma a outras classe tipo uma pessoa, essa classe vira uma classe abstrata, isso perde o instanciamento.

- Toda classe que é raiz de uma arvore, faz sentido ela ser abstrata

```
Usamos abstract após o public e antes do class


public abstract class Pessoa{
private String nome;
private String cpf;
private LocalDate nascimento;
private String endereco;
```

# Temos ainda a Titulação

```
public abstract class Funcionario extends Pessoa{
private String matricula;
private float salario;

    public Funcionario(String nome, String cpf, LocalDate nascimento, String endereco, String matricula, float salario) {
        super(nome, cpf, nascimento, endereco);
        this.matricula = matricula;
        this.salario = salario;
    }
}
```

# Poliomorfismo

Métodos abstratos

``
public abstract float calcularSalario(float salario);
```