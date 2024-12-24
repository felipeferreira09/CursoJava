package aplication;

import java.util.Scanner;
import entities.Funcionario;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Funcionario X = new Funcionario();

        System.out.println("Nome: ");
        X.nome = sc.nextLine();

        System.out.println("Salario Bruto: ");
        X.salarioBruto = sc.nextDouble();

        System.out.println("Taxa: ");
        X.taxa = sc.nextDouble();

        System.out.println("Funcionario: " + X.nome + " $" + X.salarioLiquido());

        System.out.println("Qual porcentagem deseja aumentar no salario?");
         X.porcentagem = sc.nextDouble();

        System.out.println("Dados atualizados: " + X.nome + " $" + X.aumentarSalario());

        sc.close();

    }
}
