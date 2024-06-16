// SemDesconto.java
public class SemDesconto implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco;
    }
}
