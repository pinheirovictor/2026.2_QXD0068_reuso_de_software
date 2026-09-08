package strategy;

public class FreteSedex implements EstrategiaFrete {

    @Override
    public double calcular(double peso) {
        return 20.0 + (peso * 4.0);
    }
}