
package ArrayEColections;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        // array normal
        String[] nome = new String[5];
        
        System.out.println(Arrays.toString(nome));
        
        nome[0] = "FABRICIO".concat(" Viana".toUpperCase());
        nome[1] = "Melissa".concat(" t vila".replace('t','A'));
        nome[2] = "João Tulio";
        nome[3] = "Maria juliana";
        nome[4] = "Pinto Junior";
         
        System.out.println(nome[0]
                .concat(" Ama muito sua esposa ")
                .concat(nome[1]).toUpperCase());

        System.out.println(Arrays.toString(nome));

        //matriz
        
        double[][] position = new double[3][3];
        
        
        for(int i = 0; i < nome.length;i++){
            System.out.println(nome[i]);
        }
        
        int[] decimal = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i =0;i<decimal.length;i++){
            System.out.println(decimal[i]);
        }
    }
  
}
