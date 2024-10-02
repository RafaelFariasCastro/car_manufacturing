package assembly;

import car.Car;

public class Brakes {
    private double cost = 5.0;
    private double time = 0.1;
    private double powerDemand = 1.0;
    private String materialParts = "Brakes Materials";

    public double getCost() {
        return cost;
    }

    public double getTime() {
        return time;
    }

    public double getPowerDemand() {
        return powerDemand;
    }

    public String getMaterialParts() {
        return materialParts;
    }

    public void process(Car car) {
        System.out.println("Processando Brakes para o carro: " + car.getId());
        car.addCost(this.cost);
        car.addTime((int) this.time);
        car.addPowerDemand((int) this.powerDemand);
        try {
            Thread.sleep((long) (time * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
