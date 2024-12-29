
package Classe;

public class Data {
    
    Integer dia = 1;
    Integer mes = 1;
    Integer ano = 1970;
    
    Data(){}
    
    Data(Integer dia,Integer mes,Integer ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

   String obterData(){
       return String.format("%d/%d/%d", dia, mes , ano);
   }
   
   public void imprimeData(){
       System.out.printf(obterData());
   }
    
}
