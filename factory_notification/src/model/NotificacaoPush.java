package model;

public class NotificacaoPush implements Notificacao{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH: " + mensagem);
    }
}
