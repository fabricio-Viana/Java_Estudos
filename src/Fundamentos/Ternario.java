
package Fundamentos;

import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua nota aqui: ");
        Double media = sc.nextDouble();
        String resultParcial = media >=  5.0 ? "em recuperação": "reprovado";
        String resultadoFinal = media >= 6.0 ? "Aprovado": resultParcial;
        
        System.out.println("O aluno esta " + resultadoFinal);
    }
}
