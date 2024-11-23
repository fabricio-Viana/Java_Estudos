package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioLogicos {
    public static void main(String[] args) {
        
        // trabalho n terça (v ou f)
        // trabalho na quinta (v ou f)
        
        // se os 2 forem entao comprar tv 50 se apenas um tv 30
        // e se o um ou outro forem verdadeiros então irão tomar sorvete
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Você tem dois trabalhos que podem ou não ser confirmados, %n"
                + "caso você trabalhe no dois, você irá comprar uma tv de 50 polegas, e se apenas um for confirmdo,%n"
                + "você irá comprar uma tv de de 30 e se você trabalhar em um ou outro você irá comprar sorveter e comer %n"
                + "com a familia, "
                + "caso você não trabalhe em nenhum emprego, você não irá nem comprar sorvete, nem comprar nehnuma tv.%n"
                + "Observação os trabalhos são terça e quinta.%n");
        
        System.out.println("______________________________________________________________________________________________");
        System.out.println("O trabalho de terça deu certo? V/F ");
        Character terca = sc.next().replace('v', 'V').replace('f', 'F').charAt(0);
        System.out.println("O trabalho de quinta deu certo? V/F ");
        Character quinta = sc.next().replace('v', 'V').replace('f', 'F').charAt(0);
        System.out.println("______________________________________________________________________________________________");
        
        boolean sorvete = true;
                
        if(terca == 'V' && quinta == 'V'){
            System.out.println("Você comprou a Tv de 50 Polegadas e comeu sorvete.");
            sorvete = true;
            if(sorvete == true){
                System.out.printf("Você comeu sorvete;%nSaude: -1%nFelicidade +1%n");
            }
            
        }
        if(terca == 'F' && quinta == 'V'){
            System.out.println("Você comprou a Tv de 30 Polegadas e comeu sorvete.");
            if(sorvete == true){
                System.out.printf("Você comeu sorvete;%nSaude: -1%nFelicidade +1%n");
            }
        }
        if(terca == 'V' && quinta == 'F'){
            System.out.println("Você comprou a Tv de 30 Polegadas e comeu sorvete.");
            if(sorvete == true){
                System.out.printf("Você comeu sorvete;%nSaude: -1%nFelicidade +1%n");
            }
        }
        if(terca == 'F' && quinta == 'F'){
            System.out.println("Você não comprou TV nenhuma e não comeu sorvete.");
            sorvete = !sorvete;
            if(sorvete == false){
                System.out.printf("Você não comeu sorvete;%nSaude: +1%nFelicidade -1%n");
            }
        }
        
        sc.close();
    }
    
}
