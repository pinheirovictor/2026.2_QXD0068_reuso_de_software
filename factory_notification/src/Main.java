import factory.Notificationfactory;
import model.Notificacao;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Notificacao notificacao = Notificationfactory.criar("Email");
        notificacao.enviar(
                "Seu pedido foi enviado"
        );

        notificacao = Notificationfactory.criar("SMS");
        notificacao.enviar(
                "Seu pedido está em rota de entrega"
        );

        notificacao = Notificationfactory.criar("push");
        notificacao.enviar(
                "Pedido entregue"
        );

    }
}