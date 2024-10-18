import Descontos.DescontoClienteNovo;
import Descontos.DescontoClienteRegular;
import Descontos.DescontoClienteVIP;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("camisa", 50.0);
        Produto produto2 = new Produto("calça", 100.0);
        Produto produto3 = new Produto("Tenis", 200.0);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(produto1);
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);

        carrinho.setDescontoStrategy(new DescontoClienteNovo());
        System.out.println("Total Para Cliente novo: R$ " + carrinho.calcularTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteRegular());
        System.out.println("Total Para Cliente Regular: R$ " + carrinho.calcularTotalComDesconto());

        carrinho.setDescontoStrategy(new DescontoClienteVIP());
        System.out.println("Total Para Cliente VIP: R$ " + carrinho.calcularTotalComDesconto());

    }
}