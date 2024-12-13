package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite qualquer coisa aqui");
            String texto = sc.next();

            if ("sair".equalsIgnoreCase(texto)) {
                System.out.println("""
                                   ________________
                                   tchau...
                                   ________________""");
                break;
            } else {
                System.out.println("""
                                  __________________________
                                  Texto legal escreva mais
                                  __________________________
                                  se quiser sair escreva sair,
                                  se quiser continuar 
                                  continue escrevendo.
                                  __________________________
                                  """);
            }
        }
    }
}
