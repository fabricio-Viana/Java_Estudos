
package Classe;
import java.util.Scanner;

public class Jantar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Me diga o nome:");
        String nome = sc.next();
        System.out.println("Me diga o peso");
        Double pesoPessoa = sc.nextDouble();
        
        Pessoa p1 = new Pessoa(nome,pesoPessoa);
        
        System.out.println(p1.nome+" "+p1.pesoPessoa +"KG");
        
        p1.comer(new Comida("Hamburguer",0.500));
        
        p1.comer(new Comida("Pizza",1));
        
        //-----------------------------------------------
        
        System.out.println("Me diga o nome da outra pessoa:");
        String nome2 = sc.next();
        System.out.println("Me diga o peso da outra pessoa");
        Double pesoPessoa2 = sc.nextDouble();
        
        Pessoa p2 = new Pessoa(nome2,pesoPessoa2);
        
        System.out.println(p2.nome+" "+p2.pesoPessoa +"KG");
        
        p2.comer(new Comida("Salada",0.100));
        
        p2.comer(new Comida("Macarrão",300));
        
        
        
        
        
        sc.close();
    }
    
}
