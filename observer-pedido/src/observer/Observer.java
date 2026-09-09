package observer;

// Todos os observadores precisam saber receber atualizações.
public interface Observer {

    void atualizar(String status);
}