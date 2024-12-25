
package Classe;

import Classe.Produto;

public class ProdutoText {

    public static void main(String[] args) {
        
        Produto produto = new Produto();
    
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.desconto);
         
        produto.desconto = 0.46;
        produto.nome = "Carro";
        produto.preco = 50.00000;
        
        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.desconto);
        
        double precoFinal = produto.preco * (1 - produto.desconto);
        System.out.println(precoFinal);
    }
    
}
