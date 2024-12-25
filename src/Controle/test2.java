package Controle;

import javax.swing.JOptionPane;

public class test2 {

    public static void main(String[] args) {
        w:
        while (true) {

            System.out.println("Digite um valor");
            String valor = JOptionPane.showInputDialog("Digite um valor");
            System.out.println("Digite outro valor");
            String valor2 = JOptionPane.showInputDialog("Digite outro valor");

            int result = Integer.parseInt(valor) + Integer.parseInt(valor2);

            JOptionPane.showMessageDialog(null, "A soma de ".concat(valor).concat(" + ".concat(valor2).concat(" é igual a " + result)));

            while (true) {

                String sn = JOptionPane.showInputDialog("Você quer somar mais uma vez ? (S/N)");

                if ("S".equals(sn) || "s".equals(sn)) {
                    continue w;
                }
                if ("N".equals(sn) || "n".equals(sn)) {
                    JOptionPane.showMessageDialog(null, "TCHAU...");
                    break w;
                }
                if (!"S".equals(sn) || !"s".equals(sn) || !"N".equals(sn) || !"s".equals(sn)) {
                    JOptionPane.showMessageDialog(null, "RESPOSTA INVALIDA");

                }
            }

        }

    }

}
