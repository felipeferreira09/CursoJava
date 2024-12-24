package application;
import entities.Product;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Qauntity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product); //chamar a classe product chama o toStringb

        System.out.println();
        System.out.println("Diga o numero para add no estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println(product);

        System.out.println();
        System.out.println("Diga o numero para remover no estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
       sc.close();

       System.out.println(product);
    }
}
