
package Controle;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Digite seu nome: ");
            String nome = sc.next();
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.printf("Seu nome é %s e sua idade é %d anos ",nome ,idade);
        }while(false);
        // o DO WHILE definitivamente vai escrever o codigo pelo menos uma vez antes de parar
        sc.close();
        
    }
    
}
