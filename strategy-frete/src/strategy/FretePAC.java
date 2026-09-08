package strategy;

public class FretePAC implements EstrategiaFrete {

    @Override
    public double calcular(double peso) {
        return 10.0 + (peso * 2.0);
    }
}