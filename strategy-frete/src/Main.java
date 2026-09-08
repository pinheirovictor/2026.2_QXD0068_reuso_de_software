import strategy.FretePAC;
import strategy.FreteSedex;
import model.Pedido;
import strategy.RetiradaLoja;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(
                200.0,
                3.0,
                new FretePAC()
        );

        System.out.println("=== PAC ===");
        System.out.printf(
                "Frete: R$ %.2f%n",
                pedido.calcularFrete()
        );

        System.out.printf(
                "Total: R$ %.2f%n",
                pedido.calcularTotal()
        );

        pedido.setEstrategiaFrete(
                new FreteSedex()
        );

        System.out.println("\n=== SEDEX ===");

        System.out.printf(
                "Frete: R$ %.2f%n",
                pedido.calcularFrete()
        );

        System.out.printf(
                "Total: R$ %.2f%n",
                pedido.calcularTotal()
        );

        pedido.setEstrategiaFrete(
                new RetiradaLoja()
        );

        System.out.println("\n=== RETIRADA NA LOJA ===");

        System.out.printf(
                "Frete: R$ %.2f%n",
                pedido.calcularFrete()
        );

        System.out.printf(
                "Total: R$ %.2f%n",
                pedido.calcularTotal()
        );
    }
}