package Descontos;

public class DescontoClienteRegular implements DescontoStrategy {
    @Override
    public double calcular(double preco) {
        return preco * 0.10;
    }
}
