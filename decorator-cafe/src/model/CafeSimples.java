package model;

public class CafeSimples implements Cafe {

    @Override
    public String getDescricao() {
        return "Café";
    }

    @Override
    public double getPreco() {
        return 5.00;
    }
}
