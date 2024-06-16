# **Estrutura do Projeto**

***Singleton:*** Para garantir que exista apenas uma instância da classe que gerencia o estoque de produtos.


***Strategy:*** Para permitir diferentes estratégias de cálculo de desconto.


***Facade:*** Para fornecer uma interface simples para o sistema de pedidos.

# **Explicação**

***Singleton (Estoque):*** A classe Estoque garante que só existe uma instância que gerencia os produtos. Isso é útil para garantir que todos os pedidos acessem o mesmo estoque.


***Strategy (DescontoStrategy):*** Permite que diferentes estratégias de cálculo de desconto sejam aplicadas aos pedidos. Pode-se trocar a estratégia de desconto dinamicamente.


***Facade (PedidoFacade):*** Fornece uma interface simplificada para fazer pedidos, escondendo a complexidade do sistema.
