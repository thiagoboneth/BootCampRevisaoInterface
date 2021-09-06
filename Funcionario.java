import java.util.Locale;

public class Funcionario {


    private String nome;
    private String sexo;
    private double salario;


    public Funcionario(String nome, String sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }


    public double getSalario(){
        return this.salario;
    }

    public String getNome(){
        return this.nome.toUpperCase(Locale.ROOT);
    }

    public String getSexo(){
        return this.sexo;
    }

    public String toString(){
        return nome + " " + sexo + " " + getSalario();
    }
}
