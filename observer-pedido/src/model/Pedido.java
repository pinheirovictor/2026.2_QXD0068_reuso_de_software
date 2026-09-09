package model;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String status;

    // Lista de interessados nas mudanças do pedido.
    private List<Observer> observadores = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observadores.add(observer);
    }

    public void removerObserver(Observer observer) {
        observadores.remove(observer);
    }

    public void setStatus(String status) {

        this.status = status;

        // Sempre que o status muda,
        // todos os observadores são avisados.
        notificar();
    }

    private void notificar() {

        for (Observer observer : observadores) {
            observer.atualizar(status);
        }
    }
}