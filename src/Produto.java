public class Produto {
    private String codigoBarras;
    private String descricao;
    private Double preco;

    public Produto(String codigoBarras, String descricao, Double preco) {
        this.codigoBarras = codigoBarras;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }
}