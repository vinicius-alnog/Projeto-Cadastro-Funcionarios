package util;

public class Funcionarios {
    
    private String nome;
    private double salario;
    private String departamento;
    
    public Funcionarios(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double salarioMedio (double X, double N) {
        return X / N;
    }
    
    public void aplicarAumento(double percentual) {
        this.salario *= (1 + percentual / 100);
    }

    @Override
    public String toString() {
        return nome + " - R$ " + String.format("%.2f", salario) + " - " + departamento;
    }
   
}
