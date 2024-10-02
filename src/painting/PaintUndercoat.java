package painting;

import car.Car;

public class PaintUndercoat {
    private double cost;
    private int time; 
    private int powerDemand;
    private int materialParts;

    public PaintUndercoat() {
        this.cost = 2.0;
        this.time = 2;
        this.powerDemand = 30;
        this.materialParts = 8; 
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
        System.out.println("Processando Paint Undercoat para o carro: " + car.getId());
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
