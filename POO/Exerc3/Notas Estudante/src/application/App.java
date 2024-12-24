package application;
import java.util.Scanner;

import entities.Estudante;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Estudante X = new Estudante();

        System.out.println("Qual o nome do estudante?");
        X.nome = sc.nextLine();

        System.out.println("Digite as notas do estudante");
        X.nota1 = sc.nextInt();
        X.nota2 = sc.nextInt();
        X.nota3 = sc.nextInt();

        if (X.notaFinal() > 60) {
            System.out.println("Final grade = " + X.notaFinal());
            System.out.println("PASS");
        }
        else {
            System.out.println("Final grade = " + X.notaFinal());
            System.out.println("FAILED");
            System.out.println("MISSING " + X.faltaFinal() + " POINTS");

        }


        sc.close();

    }
}
