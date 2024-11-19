
package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        
        double a = 4.5;
        System.out.println(a);
    
        /* a inferencia usando "var" vai pegar o tipo da variavel
         e definir o tipo dela 
        de acordo com o valor atribuido*/
        var b = 4.5;
        
        var c = "texto";
        System.out.println(c);
        
        c = "Helo World";
        System.out.println(c);
        
        
        // não podemos usar este codigo abaixo usando o "var"
       
        double d;
        d= 123.65;
        System.out.println(d);
       
       
       
    }
}
