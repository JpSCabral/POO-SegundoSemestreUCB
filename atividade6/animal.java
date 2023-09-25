package atividade6;

public class animal {
    protected String nome;
    protected Integer idade;
    protected String raca;
    protected String  cor;




    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String comer (){
        return "Comeu";
    }public String andar (){
        return "Andou";
    }
}
