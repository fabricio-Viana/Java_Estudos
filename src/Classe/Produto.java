 
package Classe;

public class Produto {
    
    String nome;
    double preco;
    double desconto;
    
    Produto (){}
    
    Produto (String nome,double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }
    
    
    
     Double precoComDesconto(){
        return preco * (1 -desconto );
     }
     
     Double precoComDesconto(double descontoGerente){
        return preco * (1 -desconto + descontoGerente);
     }
    
}
