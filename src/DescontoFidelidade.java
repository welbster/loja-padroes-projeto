// DescontoFidelidade.java
public class DescontoFidelidade implements DescontoStrategy {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.9; // 10% de desconto
    }
}
