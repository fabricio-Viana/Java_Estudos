
package Fundamentos;
public class Wrapper {
    
    public static void main(String [] args){
    
       
        Byte b =100;  // byte
        Short s = 1000; // short
        Integer i = Integer.parseInt("1000"); // int
        Long l = 100000L ; // long
        
        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i*2);
        System.out.println(l/3);
        
        Float f = 4.8f;
        System.out.println(f.isInfinite());
        
        Double dd = 6.92;
        System.out.println(dd);
        
        
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        
        Character c = '#';// char
        System.out.println(c + "...");
        
    }
}
