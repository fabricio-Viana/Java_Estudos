
package Classe;

public class AreaCircTeste {
    
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        // a1.pi = 1
   
        AreaCirc a2 = new AreaCirc(5);
        // a2.pi = 5;
        
        //AreaCirc.PI = 3.1415;
        
        System.out.println(a1.area());
        System.out.println(AreaCirc.PI);
        System.out.println(Math.PI);
        
        System.out.println(AreaCirc.area(10));
       
    }
}
