public class CartaoCreditoStrategy
        implements MeioPagamentoStrategy{

    private String nome;
    private String numero;
    private String cvv;
    private String dataVencimento;

    public CartaoCreditoStrategy(String nome,
                                 String numero,
                                 String cvv,
                                 String dataVencimento) {
        this.nome = nome;
        this.numero = numero;
        this.cvv = cvv;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public void pagar(Double receber) {
        System.out.println("Pagamento com " +
                "Cartão de Crédito " +
                receber + " finalizado");
    }
}
