
package Classe;

public class ProdutoText {

    public static void main(String[] args) {
        
        Produto produto = new Produto("Carro",50.000);
        
        Produto p2 = new Produto();

        double precoFinal = produto.precoComDesconto(0.70);
        System.out.println(precoFinal);
    }
    
}
