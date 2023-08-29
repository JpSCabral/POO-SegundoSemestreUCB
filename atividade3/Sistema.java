package atividade3;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public List<Produto> produtos = new ArrayList<>();

    public void addProd(String nomeProd, int quantidade) {
        produtos.add(new Produto(nomeProd, quantidade));
    }

    public void removerProd(String nomeProd) {
        produtos.removeIf(produto -> produto.getNomeProd().equals(nomeProd));
    }

    public void listarProd() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
