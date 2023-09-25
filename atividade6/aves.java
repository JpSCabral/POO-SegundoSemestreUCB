package atividade6;

public class aves extends animal{
    private String tipoDeBico;

    public aves (String nome, Integer idade, String raca, String cor, String tipoDeBico){
        this.nome = nome;
        this.idade = idade;
        this.tipoDeBico = tipoDeBico;
        this.raca = raca;
        this.cor = cor;
    }

    public String getTipoDeBico() {
        return tipoDeBico;
    }

    public void setTipoDeBicoet(String tipoDeBico) {
        this.tipoDeBico = tipoDeBico;
    }
}

