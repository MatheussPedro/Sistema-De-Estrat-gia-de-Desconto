public class PixStrategy
        implements MeioPagamentoStrategy{
    @Override
    public void pagar(Double receber) {
        System.out.println("Pagamento com PIX " +
        receber + " finalizado");
    }
}
