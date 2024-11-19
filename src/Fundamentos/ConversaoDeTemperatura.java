
package Fundamentos;
import java.util.Scanner;
public class ConversaoDeTemperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma temperatura em Fahrenhei");
        Double f = sc.nextDouble();
        
        final Double c = (f-32) * 5/9;
        
        System.out.println("-----------------------------------");
        System.out.println("Convertendo Fahrenhei para Celsius..." );
        System.out.println("A temperatura de "+ f + "Fahrenhei em Celsius é de "+ c + "º");
        

        
    }
    
}
