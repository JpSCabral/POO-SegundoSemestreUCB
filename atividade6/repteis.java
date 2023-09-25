package atividade6;

public class repteis extends animal{
    private String coberturaCorporal;

    public repteis (String nome, Integer idade, String raca, String cor, String coberturaCorporal){
        this.nome = nome;
        this.idade = idade;
        this.coberturaCorporal = coberturaCorporal;
        this.raca = raca;
        this.cor = cor;
    }

    public String getCoberturaCorporal() {
        return coberturaCorporal;
    }

    public void setCoberturaCorporal(String coberturaCorporal) {
        this.coberturaCorporal = coberturaCorporal;
    }
}
