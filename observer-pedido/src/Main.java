import model.Pedido;
import observer.ClienteObserver;
import observer.LojaObserver;
import observer.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Observer cliente =
                new ClienteObserver("João");

        Observer loja =
                new LojaObserver();

        pedido.adicionarObserver(cliente);
        pedido.adicionarObserver(loja);

        pedido.setStatus("Pagamento aprovado");

        System.out.println();

        pedido.setStatus("Pedido enviado");
    }
}