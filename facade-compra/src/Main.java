//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import facade.CompraFacade;

public class Main {

    public static void main(String[] args) {

        CompraFacade compra =
                new CompraFacade();

        compra.finalizarCompra(
                "Notebook",
                3500.00,
                "Rua A, 123"
        );
    }
}


//Sem Facade
//
//O Main teria que fazer:
//
//EstoqueService estoque = new EstoqueService();
//PagamentoService pagamento = new PagamentoService();
//EntregaService entrega = new EntregaService();
//
//estoque.verificarProduto("Notebook");
//pagamento.processarPagamento(3500);
//entrega.agendarEntrega("Rua A, 123");