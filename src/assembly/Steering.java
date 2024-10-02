package assembly;

import car.Car;

public class Steering {
    private double cost = 2.0;
    private double time = 0.3;
    private double powerDemand = 3.0;
    private String materialParts = "Steering Materials";

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
        System.out.println("Processando Steering para o carro: " + car.getId());
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

