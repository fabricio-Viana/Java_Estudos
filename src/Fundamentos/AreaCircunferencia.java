
package Fundamentos;

//aqui iremos trabalhar a idea variaveis e constantes.

public class AreaCircunferencia {
    
    public static void main(String[] args) {
       double raio = 3.4; 
       final double PI = 3.14159; /* adicionando a expressao final 
       diz que o tipo e uma constante e constantes são 
       representadas com letra MAIUSCULAS.*/
       
       
       double area =  PI* raio *raio;
       
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = "+ area +"m2");
        
    }
}
