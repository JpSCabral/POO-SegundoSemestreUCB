package heranca.empresa;

public class funcionario {
    protected String nome;
    protected Integer cpf;
    protected Integer telefone;

    public Integer getTelefone() {
        return telefone;
    }

    public Integer getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
}
