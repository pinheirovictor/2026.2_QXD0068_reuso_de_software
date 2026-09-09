package facade;

import service.EntregaService;
import service.EstoqueService;
import service.PagamentoService;

public class CompraFacade {

    private EstoqueService estoque;
    private PagamentoService pagamento;
    private EntregaService entrega;

    public CompraFacade() {

        estoque = new EstoqueService();
        pagamento = new PagamentoService();
        entrega = new EntregaService();
    }

    public void finalizarCompra(
            String produto,
            double valor,
            String endereco) {

        System.out.println("Iniciando compra...");

        if (!estoque.verificarProduto(produto)) {

            System.out.println(
                    "Produto indisponível."
            );

            return;
        }

        pagamento.processarPagamento(valor);

        entrega.agendarEntrega(endereco);

        System.out.println(
                "Compra finalizada com sucesso!"
        );
    }
}
