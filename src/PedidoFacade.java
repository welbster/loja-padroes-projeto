// PedidoFacade.java
public class PedidoFacade {
    private Estoque estoque;
    private DescontoStrategy descontoStrategy;

    public PedidoFacade() {
        this.estoque = Estoque.getInstance();
        this.descontoStrategy = new SemDesconto(); // Estrategia padrão
    }

    public void setDescontoStrategy(DescontoStrategy descontoStrategy) {
        this.descontoStrategy = descontoStrategy;
    }

    public double fazerPedido(String codigoProduto, int quantidade) {
        Produto produto = estoque.getProduto(codigoProduto);
        if (produto != null) {
            double precoTotal = produto.getPreco() * quantidade;
            return descontoStrategy.calcularDesconto(precoTotal);
        }
        return 0.0;
    }
}
