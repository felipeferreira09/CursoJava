package aplication;
import java.util.Scanner;

import entities.Retangle;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        Retangle x = new Retangle();

        System.out.println("Entre a largura e altura do retangulo: ");
        x.largura = sc.nextDouble();
        x.altura = sc.nextDouble();

      //  System.out.println("A largura é: " + x.largura + " e a altura: " + x.altura);

        
        System.out.println("A area é: " + x.area());
        System.out.println("o perimetro é: " + x.perimetro());
        System.out.println("a diagonal é: " + x.diagonal());



        sc.close(); 

    }
}
