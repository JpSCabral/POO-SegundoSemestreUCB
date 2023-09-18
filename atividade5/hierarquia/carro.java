package atividade5.hierarquia;

public class carro extends veiculo{

    public carro(String marca, Integer anoDeFabricacao, String modelo, Integer velocidade, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.velocidade = velocidade;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "[" + " Marca: " + getMarca() + "|"+ " Modelo: "+ getModelo() + "|" + " Ano de Fabricaçao: " + getAnoDeFabricacao() + "|" + " Velocidade: " + getVelocidade() + "|" + " Cor: " + getCor() + "]";
    }
}
