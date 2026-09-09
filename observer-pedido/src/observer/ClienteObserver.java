package observer;

public class ClienteObserver implements Observer {

    private String nome;

    public ClienteObserver(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String status) {
        System.out.println(
                "Cliente " + nome +
                        " recebeu atualização: " + status
        );
    }
}