import java.util.ArrayList;

public class Carrinho {
    private ArrayList<Produto> lista
            = new ArrayList<>();

    public void addProduto(Produto produto){
        this.lista.add(produto);
    }

    public void removeProduto(Produto produto){
        this.lista.remove(produto);
    }

    public void receber(
            MeioPagamentoStrategy meioPgto){
        meioPgto.pagar(getTotalProdutos());
    }

    private Double getTotalProdutos() {
        Double totalProdutos = 0.0;

        for(Produto produto : this.lista){
            totalProdutos += produto.getPreco();
        }

        return totalProdutos;
    }
}
