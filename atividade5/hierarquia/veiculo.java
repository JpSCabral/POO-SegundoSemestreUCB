package atividade5.hierarquia;

import java.security.ProtectionDomain;

public class veiculo {
    protected String marca;
    protected String modelo;
    protected Integer anoDeFabricacao;
    protected String cor;
    protected Integer velocidade;

    public void setAnoDeFabricacao(Integer anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidade(Integer velocidade) {
        this.velocidade = velocidade;
    }

    public Integer getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public Integer getVelocidade() {
        return velocidade;
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer acelerar(Integer velo){
        return getVelocidade() + velo;
    }
    public Integer freiar(Integer velo){
        return getVelocidade() - velo;
    }

}
