
package Classe;

public class Data {
    
    Integer dia = 1;
    Integer mes = 1;
    Integer ano = 1970;
    
    Data(){
        
        this(1,1,1970);
    }
    
    Data(Integer dia ,Integer mes,Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

   String obterData(){
       String formato = "%d/%d/%d";
       return String.format(formato, dia, mes , ano);
   }
   
   public void imprimeData(){
       System.out.printf(obterData());
   }
   
    
}
