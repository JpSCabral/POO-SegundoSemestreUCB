package heranca.empresa;

public class engenheiro extends funcionario {
    private String projeto;
    private Integer crea;
    public engenheiro(String nome, String projeto, Integer crea, Integer cpf, Integer telefone){
        this.projeto = projeto;
        this.telefone = telefone;
        this.nome = nome;
        this.crea = crea;
        this.cpf = cpf;

    }
    public void setCrea(Integer crea) {
        this.crea = crea;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }


    public Integer getCrea() {
        return crea;
    }

    public String getProjeto() {
        return projeto;
    }

    @Override
    public String toString() {
        return "[" + " Nome: " + getNome() + "|"+ " Projeto: "+ getProjeto() + "|" + " CPF: " + getCpf() + "|" + " Telefone: " + getTelefone() + "|" + " CREA: " + getCrea() + "]";
    }

}
