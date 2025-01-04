
package Classe;

public class Pessoa {
    String nome;
    double pesoPessoa;
    
    public Pessoa(String nome,double pesoPessoa){
        this.nome = nome;
        this.pesoPessoa = pesoPessoa;
    }
    
    public void comer(Comida comida){
        System.out.println(this.nome
                .concat(" esta na mesa e com o peso de ")
                +pesoPessoa+" KG");
        
        this.pesoPessoa  = pesoPessoa + comida.pesoComida;
        
        System.out.println(this.nome.concat(" comeu ")
                .concat(comida.nome)
                .concat(" e agora esta com o peso de ")
                +pesoPessoa+" KG");
        

    }
    
}
