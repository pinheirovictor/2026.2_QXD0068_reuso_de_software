package decorator;

import model.Cafe;

// Classe-base para os decorators.
public abstract class CafeDecorator implements Cafe {

    protected Cafe cafe;

    public CafeDecorator(Cafe cafe) {
        this.cafe = cafe;
    }
}