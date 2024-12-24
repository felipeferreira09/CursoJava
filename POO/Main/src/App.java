import entities.Triangle;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);



        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        
        double areaX = x.area();

         
        double areaY = y.area(); 
        
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle X area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Area X é maior");
        }
        else {
            System.out.println("Area Y é maior");
        }
        sc.close(); 
         
    }
}
