
package Fundamentos;

public class Cast {
    public static void main(String[] args) {
        
        double a = 1.8708708086086086868; // conversão implicita
        System.out.println(a);
        
        float b = (float) 1.8708708086086086868;// conversão explicita perde informação
        
        System.out.println(b);
        
        int c =3;
        byte d = (byte) c;
        System.out.println(d);
        
         int e = 1230;
        byte f = (byte) e;
        System.out.println(f); // perde informação
        
        double g = 1;
        int h  = (int) g;
        System.out.println(g);
        
    }
    
}
