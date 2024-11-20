
package Fundamentos;


public class TiposPrimitivos {
    
    public static void main(String[] args) {
        
        //Informações do funcionario
        
        // tipos numericos inteiros
        
        byte anosDeEmpresa = 1;
        short numerosDeVoos = 300;
        int id = 786543234;
        long PontosAcumulados = 236936783375L; //numeros longs que passam da capacidade de int deve-se colocar um L
        
        // NUMEROS REAIS
        
        float salario = 720.32F; //numeros floats devem ser reveridos com F pois o padrão é Double.
        double vendasAcumuladas = 484984949.48;
        
        // tipo booleano
        
        boolean estaDeFerias = false;
        
        //tipo caractere
        char genero = 'F';
        
        //dias de empresa
        
        System.out.println(anosDeEmpresa *365);
        
        //numeros de viajens
        
        System.out.println(numerosDeVoos/2);
        
        //pontos por real
        System.out.println(PontosAcumulados/vendasAcumuladas);
        
        System.out.println(id+" ganha -->" + salario);
        System.out.println("ferias "+ estaDeFerias);
        System.out.println("genero "+ genero);
    }
    
    
    
}
