package Controle;

import java.util.Scanner;

public class DesafioSemana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("""
                           Digite um dia da semana
                           que te falo o número 
                           que ele representa: 
                           ------------------
                           Digite aqui: """);
        String dia = sc.nextLine();

        if ("domingo".equals(dia) || "DOMINGO".equals(dia)) {
            System.out.println("""
                               
                               Domingo é o dia 1 da semana,
                               isto sabendo que uma semana tem 7 dias """);
        } else if ("segunda".equals(dia) || "SEGUNDA".equals(dia)) {
            System.out.println("""
                               
                               segunda é o dia 2 da semana,
                               isto sabendo que uma semana tem 7 dias
                               por isso que se chama segunda.
                               """);
        } else if ("terça".equals(dia) || "TERÇA".equals(dia)|| "terca".equals(dia) || "TERCA".equals(dia)) {
            System.out.println("""
                               
                               Terça é o dia 3 da semana,
                               isto sabendo que uma semana tem 7 dias
                               por isso que se chama terça de terceiro dia.
                               """);
        } else if ("quarta".equals(dia) || "QUARTA".equals(dia)) {
            System.out.println("""
                               
                               Quarta é o dia 4 da semana,
                               isto sabendo que uma semana tem 7 dias
                               por isso que se chama quarta de quarto dia.
                               """);
        }  else if ("QUINTA".equals(dia)|| "quinta".equals(dia)) {
            System.out.println("""
                               
                               Quinta é o dia 5 da semana,
                               isto sabendo que uma semana tem 7 dias
                               por isso que se chama quinta de quinto dia.
                               """);
        }  else if ("sexta".equals(dia) || "SEXTA".equals(dia)) {
            System.out.println("""
                               
                               Sexya é o dia 6 da semana,
                               isto sabendo que uma semana tem 7 dias
                               por isso que se chama sexta de sexto dia.
                               """);
        }  else if ("sabado".equals(dia) || "SABADO".equals(dia)) {
            System.out.println("""
                               
                               Terça  é o dia 3 da semana,
                               isto sabendo que uma semana tem 7 dias
                               por isso que se chama terça de terceiro.
                               """);
        }  else{
            System.out.println("opção invalida");
        }
        
        System.out.println("FIM");
    }
}
