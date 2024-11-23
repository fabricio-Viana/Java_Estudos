
package Fundamentos;

import javax.swing.JOptionPane;

public class ConvesaoStringNumero {
    public static void main(String [] args){
    
        String v1 = JOptionPane.showInputDialog("Digite sua nota em matematica");
        String v2 = JOptionPane.showInputDialog("Digite sua nota em português");
        
        System.out.println(v1+v2);
        
        Double n1 = Double.parseDouble(v1);
        Double n2 = Double.parseDouble(v2);
        
        System.out.println("sua nota em matematica é "+ v1);
        System.out.println("sua nota em português é "+ v2);
         
        Double soma = n1+n2;
        
        System.out.println("sua media é  de  "+ soma/2);
        
        
        
        
    }
}
