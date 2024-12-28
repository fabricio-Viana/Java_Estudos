package Classe;

public class DataTest {

    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();
        
        d1.dia = 12;
        d1.mes = 12;
        d1.ano = 2012;
        
        d2.dia = 31;
        d2.mes = 03;
        d2.ano = 2023;
        
        String imprime = d1.obterData();
        
        System.out.println(imprime);
        System.out.println(d2.obterData());
        
        d3.dia = 28;
        d3.mes = 12;
        d3.ano = 2024;
        
        d3.imprimeData();
        
    }

}
