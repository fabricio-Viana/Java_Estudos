
package Fundamentos;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Digite seu nome ");
        
        String nome = sc.nextLine();
        
        System.out.print("Digite sei sobrenome ");
        
        String sobrenome = sc.nextLine();
        
        System.out.print("sua idade: ");
        
        int idade = sc.nextInt();
        
        System.out.println("Nome: ".concat(nome)
                +", Sobrenome: ".concat(sobrenome)
                +", Idade: "+ idade);
        
        sc.close();
        
    }
}
