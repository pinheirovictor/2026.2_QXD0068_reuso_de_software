package decorator;

import model.Cafe;

public class ComLeite extends CafeDecorator {

    public ComLeite(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + leite";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 2.00;
    }
}
