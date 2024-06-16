// Main.java
public class Main {
    public static void main(String[] args) {
        PedidoFacade pedidoFacade = new PedidoFacade();

        // Fazer um pedido sem desconto
        double totalSemDesconto = pedidoFacade.fazerPedido("001", 2);
        System.out.println("Total sem desconto: " + totalSemDesconto);

        // Aplicar estratégia de desconto de fidelidade e fazer um pedido
        pedidoFacade.setDescontoStrategy(new DescontoFidelidade());
        double totalComDesconto = pedidoFacade.fazerPedido("002", 3);
        System.out.println("Total com desconto: " + totalComDesconto);
    }
}
