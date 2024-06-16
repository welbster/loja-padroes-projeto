import java.util.HashMap;
import java.util.Map;

// Estoque.java
public class Estoque {
    private static Estoque instance;
    private final Map<String, Produto> produtos;

    private Estoque() {
        produtos = new HashMap<>();
        // Adicionar alguns produtos iniciais
        produtos.put("001", new Produto("001", "Produto 1", 100.0));
        produtos.put("002", new Produto("002", "Produto 2", 200.0));
    }

    public static synchronized Estoque getInstance() {
        if (instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public Produto getProduto(String codigo) {
        return produtos.get(codigo);
    }
}
