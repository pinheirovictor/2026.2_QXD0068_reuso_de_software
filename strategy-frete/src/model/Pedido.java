package model;

import strategy.EstrategiaFrete;

public class Pedido {

    private double valorProdutos;
    private double peso;
    private EstrategiaFrete estrategiaFrete;

    public Pedido(
            double valorProdutos,
            double peso,
            EstrategiaFrete estrategiaFrete) {

        this.valorProdutos = valorProdutos;
        this.peso = peso;
        this.estrategiaFrete = estrategiaFrete;
    }

    public double calcularFrete() {
        return estrategiaFrete.calcular(peso);
    }

    public double calcularTotal() {
        return valorProdutos + calcularFrete();
    }

    public void setEstrategiaFrete(EstrategiaFrete estrategiaFrete) {
        this.estrategiaFrete = estrategiaFrete;
    }

    public double getValorProdutos() {
        return valorProdutos;
    }

    public double getPeso() {
        return peso;
    }
}