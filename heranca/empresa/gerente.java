package heranca.empresa;


public class gerente extends funcionario{
    private  Integer qntGerenciados;


    public gerente(String nome, Integer qntGerenciados, Integer cpf, Integer telefone){

        this.telefone = telefone;
        this.nome = nome;
        this.qntGerenciados = qntGerenciados;
        this.cpf = cpf;

    }

    public Integer getQntGerenciados() {
        return qntGerenciados;
    }

    public void setQntGerenciados(Integer qntGerenciados) {
        this.qntGerenciados = qntGerenciados;
    }

    @Override // sobreescreve os metodos da classe superior
    public String toString() {
        return "[" + " Nome: " + getNome() + "|" + " CPF: " + getCpf() + "|" + " Telefone: " + getTelefone() + "|" + " Quantidade de gerenciados: " + getQntGerenciados() + "]";
    }
}
