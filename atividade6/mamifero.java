package atividade6;

public class mamifero extends animal {
    private String corPelagem;

    public mamifero (String nome, Integer idade, String raca, String cor, String corPelagem){
        this.nome = nome;
        this.idade = idade;
        this.corPelagem = corPelagem;
        this.raca = raca;
        this.cor = cor;
    }

    public String getCorPelagem() {
        return corPelagem;
    }

    public void setCorPelagem(String corPelagem) {
        this.corPelagem = corPelagem;
    }
}
