package service;

public class PagamentoService {
    public void processarPagamento(double valor) {

        System.out.printf(
                "Pagamento de R$ %.2f processado.%n",
                valor
        );
    }
}
