
package Controle;
import java.util.Scanner;
public class IF {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua media: ");
        
        Double media = sc.nextDouble();
       
        
        if(media >= 7 && media < 11 ){
            System.out.println("""
                               Aprovado!
                               Parabens!""");
        }
        
        if(media >= 4.5 && media <=6 ){
            System.out.println("""
                               Recuperação
                               Boa Sorte!
                               """);
        }
        
       if(media < 4.5 && media >= 0){
           System.out.println("""
                              Reprovado!
                              Sinto muito!
                              """);
       }
       
 
        
        sc.close();
    }
    
}
