
package Fundamentos;

import java.lang.reflect.Array;

public class test {
    
    public static void main(String[] args) {
        String nome = "Fabricio";
        String sobrenome = "Viana";
        String nome2 = "Fabricio";
        
        System.out.println(nome.concat(" "+sobrenome).concat(" Tem 22 anos"));
        
        System.out.println(nome.replace(nome, "Fabio").concat(" "+ sobrenome).concat(" tem 49 anos"));
        
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.equals(nome2));
        
                
    }
    
}
