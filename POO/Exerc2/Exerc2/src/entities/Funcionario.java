package entities;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;
    public double porcentagem;

    public double salarioLiquido() { //metodo para calcular salario liquido 
        return salarioBruto - taxa;

    }

    public double aumentarSalario() {  //metodo para aumentar salario 
    return ((porcentagem / 100) * salarioBruto) + salarioBruto - taxa;
     }
}
