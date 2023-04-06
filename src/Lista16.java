
import java.util.Scanner;


public class Lista16 {
public static void main(String[] args) throws Exception{
    
    double metros; 
    double tintas;
    double valor;

    Scanner teclado = new Scanner(System.in);
    System.out.print("Quantos metros a serem pintados?");
    metros = teclado.nextDouble();
    tintas = Math.ceil(metros / 54); 
    valor  = tintas * 80; 

    System.out.print("A quantidade de tintas é:" + tintas);
    System.out.println("O valor é: R$" + valor);

    teclado.close();
    }
}
