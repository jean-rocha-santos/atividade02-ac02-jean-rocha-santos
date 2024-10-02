package school.sptech;

import java.util.List;

public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
    }

    public Carrinho() {
    }

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Boolean existsPorNome(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
               return true;
            }
        }
        return false;
    }

    public Integer getQuantidadePorCategoria(String nome) {
        Integer qtdProdutoCategoria = 0;
        for (Produto p : produtos) {
            if (nome.equalsIgnoreCase(p.getCategoria())) {
                qtdProdutoCategoria++;
            }
        }
        return qtdProdutoCategoria;
    }

    public void limpar() {
        while (produtos.size() > 0) {
            produtos.remove(0);
        }
    }

    public void removerPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
                produtos.remove(i);
            }

        } {
        }
    }
    public Produto getPorNome(String nome){
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }
        return null;
    }

    public Double getValorTotal(){
        Double valorTotal =0.0;
        for (Produto p : produtos) {
           valorTotal += p.getPreco();
        }
        return valorTotal;
    }

}
