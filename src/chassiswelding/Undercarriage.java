package chassiswelding;

import car.Car;

public class Undercarriage {
    private double cost;
    private int time; 
    private int powerDemand;
    private int materialParts;

    public Undercarriage() {
        this.cost = 2.0;
        this.time = 1;
        this.powerDemand = 10;
        this.materialParts = 3; 
    }

    
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

    
    public void process(Car car) {
        System.out.println("Processando Undercarriage para o carro: " + car.getId());
        car.addCost(this.cost);
        car.addTime(this.time);
        car.addPowerDemand(this.powerDemand);
        
        try {
            Thread.sleep(this.time * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
