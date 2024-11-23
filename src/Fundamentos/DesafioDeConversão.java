
package Fundamentos;

import java.util.Scanner;

public class DesafioDeConversão {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Valor dos ultomos 3 salarios dos ultimos meses");
        System.out.println("Salario 01 :");
        String sal1 = sc.next().replace(",", ".");
        System.out.println("Salario 02 :");
        String sal2 = sc.next().replace(",", ".");
        System.out.println("Salario 03 :");
        String sal3 = sc.next().replace(",", ".");
        
        System.out.println("Salarios: \nSalario 1: "+sal1+
                "\nSalario 2: "+sal2+
                "\nSalario 3: "+sal3 );
        
        Double n1 = Double.parseDouble(sal1);
        Double n2 = Double.parseDouble(sal2);
        Double n3 = Double.parseDouble(sal3);
        
        Double soma = n1+n2+n3;
        System.out.println("sua media salarial é de: "+ soma/3 );
    }
    
}
