
package Classe;

public class Data {
    
    Integer dia = 12;
    Integer mes = 12;
    Integer ano = 23023;

   String obterData(){
       return String.format("%d/%d/%d", dia, mes , ano);
   }
   
   public void imprimeData(){
       System.out.printf(obterData());
   }
    
}
