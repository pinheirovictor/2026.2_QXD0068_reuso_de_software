package factory;

import model.Notificacao;
import model.NotificacaoEmail;
import model.NotificacaoPush;
import model.NotificacaoSMS;

public class Notificationfactory {

    public static Notificacao criar(String tipo){
        if(tipo.equalsIgnoreCase("EMAIL")){
            return new NotificacaoEmail();
        }

        if(tipo.equalsIgnoreCase("SMS")){
            return new NotificacaoSMS();
        }

        if(tipo.equalsIgnoreCase("PUSH")){
            return new NotificacaoPush();
        }

        throw new IllegalArgumentException(
                "Tipo de notificacao invalido"
        );
    }
}
