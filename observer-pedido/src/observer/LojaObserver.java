package observer;

public class LojaObserver implements Observer {

    @Override
    public void atualizar(String status) {
        System.out.println(
                "Loja recebeu atualização: " + status
        );
    }
}
