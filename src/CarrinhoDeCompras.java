import Descontos.DescontoStrategy;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> carrinho;
    private DescontoStrategy descontoStrategy;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
        this.descontoStrategy = descontoStrategy;
    }

    public void adicionarProduto(Produto produto) {
        this.carrinho.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : carrinho) {
            System.out.println(produto);
        }
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : carrinho) {
            total += produto.getPreco();
        }
        return total;
    }

    public double calcularTotalComDesconto() {
        double total = calcularTotal();
        double desconto = descontoStrategy.calcular(total);
        return total - desconto;
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }
}