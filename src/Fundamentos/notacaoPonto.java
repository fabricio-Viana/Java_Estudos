
package Fundamentos;

public class notacaoPonto {
    
    public static void main(String[] args) {
        // aqui vemos  que os tipos de referencia tem muitos metodos que podem nos ajudar de muitas maneirs coo o codigo abaixo
        String s = "Bom dia x";
        s = s.replace("x", "amigo");
       
        s = s.concat("!!!");
        
        System.out.println(s.toUpperCase());
        
        System.out.println("Fabricio".concat(" ama a Melissa").toUpperCase());
        
        String y = "Bom dia x"
                .replace("x", "Fabricio")
                .toUpperCase()
                .concat("!!!");               
        System.out.println(y);
        
        //tipos primitivos não tem metodos
        int a = 3;
        System.out.println(a);
    }
}
