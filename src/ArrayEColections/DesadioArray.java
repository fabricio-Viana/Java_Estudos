package ArrayEColections;

import java.util.Scanner;

public class DesadioArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quanrtas notas você quer usar");

        int numberOfNotes = sc.nextInt();

        Double[] notes = new Double[(int) numberOfNotes];

        System.out.println("Me fale as " + notes.length + " notas:");
        
        System.out.println("---------------------");

        int z = 1;
        for (int i = 0; i < notes.length ; i++) {
            System.out.print("nota "+ z +") = ");
            notes[i] = sc.nextDouble();
            z++;
        }

        System.out.println("---------------------");
        for (double n : notes) {
            System.out.println(n);
        }
        double acul = 0;
        for (int i = 0; i < notes.length; i++) {
            acul += notes[i];
        }

        double resultMedia = acul / notes.length;
        System.out.println("---------------------");
        System.out.println("Media: " + resultMedia);

        sc.close();
    }

}
