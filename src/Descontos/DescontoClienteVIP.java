package Descontos;

public class DescontoClienteVIP implements DescontoStrategy {
    @Override
    public double calcular(double preco) {
        return preco * 0.20;
    }
}
