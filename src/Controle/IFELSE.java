package Controle;


import javax.swing.JOptionPane;


public class IFELSE {
    
    public static void main(String[] args) {
       
        
        while(true){
        String valor = JOptionPane.showInputDialog("DIGITE UM NÚMERO");

        long value = Integer.parseInt(valor);

        if (value % 2 == 0) {
            JOptionPane.showMessageDialog(null, value + " É UM NÚMERO É PAR");
        } else {
            JOptionPane.showMessageDialog(null, value +" É UM NÚMERO É IMPAR");
        }
        
            String contOuNao = JOptionPane.showInputDialog("QUER CONTINUAR ? S/N");
            
            if(contOuNao.charAt(0) == 'n' || contOuNao.charAt(0) == 'N'){
                JOptionPane.showMessageDialog(null, "TCHAU...");
                break;
            }
            if(contOuNao.charAt(0) == 's' || contOuNao.charAt(0) == 'S'){
                continue;
            }
            
        }

    }
}
