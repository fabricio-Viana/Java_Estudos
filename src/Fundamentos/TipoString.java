
package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        
        System.out.println("ola pessoal".charAt(0));
        String a = "Boa tarde";
        System.out.println(a.concat(" Te amo")); 
        System.out.println(a.startsWith("Boa"));
        System.out.println(a.toLowerCase().startsWith("boa"));
        System.out.println(a.length());
        System.out.println(a.endsWith("tarde"));
        System.out.println(a.equals("boa tarde"));
        System.out.println(a.equalsIgnoreCase("boa tarde"));
        
        var nome = "Fabricio";
        var sobrenome = "Viana";
        var idade = 22;
        var salario= 743.50F;
        
        System.out.println("Nome: "+nome+" sobrenome: "+sobrenome);
        System.out.printf("o senhor %s %s tem %d anos e ganha %.2f de salario \n",nome, sobrenome, idade, salario);
        
        String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f de salario \n",nome, sobrenome, idade, salario);
        System.out.println(frase);
        
        String frase2 = "Ola pessoa legal";
        System.out.println(frase2.substring(3, 10));
        
       
        
        
    }
}
