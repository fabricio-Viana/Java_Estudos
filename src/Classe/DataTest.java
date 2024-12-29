package Classe;

public class DataTest {

    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data(12,12,2023);
        
        d1.dia = 12;
        d1.mes = 12;
        d1.ano = 2012;
        
        
        
        String imprime = d1.obterData();
        
        System.out.println(imprime);
        System.out.println(d2.obterData());
        System.out.println("");
        
        d3.imprimeData();
        
        
    }

}
