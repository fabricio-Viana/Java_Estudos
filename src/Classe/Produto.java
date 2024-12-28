 
package Classe;

public class Produto {
    
    String nome;
    double preco;
    double desconto;
    
     Double precoComDesconto(){
        return preco * (1 -desconto );
     }
     
     Double precoComDesconto(double descontoGerente){
        return preco * (1 -desconto + descontoGerente);
     }
    
}
