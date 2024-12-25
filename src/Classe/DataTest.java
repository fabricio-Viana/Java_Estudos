package Classe;

public class DataTest {

    public static void main(String[] args) {

        Data d1 = new Data();
        Data d2 = new Data();
        
        d1.dia = 12;
        d1.mes = 12;
        d1.ano = 2012;
        
        d2.dia = 31;
        d2.mes = 3;
        d2.ano = 2023;
        
        System.out.printf("Hoje é dia %d do %d de %d ",d1.dia,d1.mes,d1.ano);
        System.out.println("");
        System.out.println(d2.toString());
        
    }

}
