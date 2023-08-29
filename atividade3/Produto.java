package atividade3;

public class Produto {
    private int quantidade;
    private String nomeProd;

    Produto(String nomeProd, int quantidade){
        this.quantidade = this.quantidade;
        this.nomeProd = this.nomeProd;
    }

    public Produto(String nomeProd) {
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNomeProd(){
        return nomeProd;
    }
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    public String imprimir(){
       return "Produto {" + "Nome = " + nomeProd + "|" + "Quant. = " + quantidade + "}";
    }
}
