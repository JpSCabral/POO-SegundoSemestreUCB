package atividade3;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

    public List<Produto> produtos = new ArrayList<>();

    public void addProd(String nomeProd, int quantidade) {
        produtos.add(new Produto(nomeProd, quantidade));
    }

    public String removerProd(String nomeProd) {
        String res = "";
        if (produtos.removeIf(produto -> produto.getNomeProd().equals(nomeProd))){
            res = "Produto apagado com successo";
        }else {;
            res = "Produto nao encontrado";
    };
        return res;
    }

    public Produto getProdPorNome(String nomeProd){
        for (Produto produto : produtos){
            if (produto.getNomeProd().equals(nomeProd)){
                return produto;
            }
        }
        return null;
    }

    public void listarProd() {
        for (Produto produto : produtos) {
            System.out.println(produto.imprimir());
        }
    }
}
