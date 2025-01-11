
package ArrayEColections;


public class Array1 {
    public static void main(String[] args) {
        
        String[] nome = new String[5];
        
        
        nome[0] = "FABRICIO".concat(" Viana".toUpperCase());
        nome[1] = "Melissa".concat(" t vila".replace('t','A'));
        
        System.out.println(nome[0]
                .concat(" Ama muito sua esposa ")
                .concat(nome[1]).toUpperCase());
        
        System.out.println( nome.equals(nome[0]));
         
        
    }
  
}
