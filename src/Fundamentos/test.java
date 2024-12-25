
package Fundamentos;

import java.util.ArrayList;
import java.util.Arrays;



public class test {
    
    public static void main(String[] args) {
        
        String nome = "Fabricio";
        String sobrenome = "Viana";
        String nome2 = "Fabricio";
        
        System.out.println(nome.concat(" "+sobrenome).concat(" Tem 22 anos"));
        
        System.out.println(nome.replace(nome, "Fabio").concat(" "+ sobrenome).concat(" tem 49 anos"));
        
        System.out.println(nome.equals(sobrenome));
        System.out.println(nome.equals(nome2));
        
        String nomes[] = new String[5];
        
        nomes[1] = "Fabricio";
        nomes[0] = "Melissa";
        nomes[2] = "Aurora";
        nomes[3] = "Levi";
      
        System.out.println(Arrays.toString(nomes));
                
    }
    
}
