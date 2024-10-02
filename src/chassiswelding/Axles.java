package chassiswelding;

import car.Car;

public class Axles {
    private double cost;
    private int time; // em segundos
    private int powerDemand;
    private int materialParts;

    public Axles() {
        this.cost = 2.0;
        this.time = 1;
        this.powerDemand = 10;
        this.materialParts = 5; // Valor inicial arbitrário
    }

    // Getters e Setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPowerDemand() {
        return powerDemand;
    }

    public void setPowerDemand(int powerDemand) {
        this.powerDemand = powerDemand;
    }

    public int getMaterialParts() {
        return materialParts;
    }

    public void setMaterialParts(int materialParts) {
        this.materialParts = materialParts;
    }

    // Método de processamento
    public void process(Car car) {
        System.out.println("Processando Axles para o carro: " + car.getId());
        car.addCost(this.cost);
        car.addTime(this.time);
        car.addPowerDemand(this.powerDemand);
        // Simula o tempo de processamento
        try {
            Thread.sleep(this.time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
