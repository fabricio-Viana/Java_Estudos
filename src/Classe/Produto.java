 
package Classe;

public class Produto {
    
    String nome;
    double preco;
    static double desconto = 0.25;
    
    Produto (){}
    
    Produto (String nome,double preco){
        this.nome = nome;
        this.preco = preco;
        
    }
    
     Double precoComDesconto(){
        return preco * (1 - desconto );
     }
     
     Double precoComDesconto(double descontoGerente){
        return preco * (1 -desconto + descontoGerente);
     }
    
}
