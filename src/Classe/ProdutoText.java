
package Classe;

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
        
        double precoFinal = produto.precoComDesconto(0.70);
        System.out.println(precoFinal);
    }
    
}
