package decorator;

import model.Cafe;

public class ComChocolate extends CafeDecorator {

    public ComChocolate(Cafe cafe) {
        super(cafe);
    }

    @Override
    public String getDescricao() {
        return cafe.getDescricao() + " + chocolate";
    }

    @Override
    public double getPreco() {
        return cafe.getPreco() + 3.00;
    }
}