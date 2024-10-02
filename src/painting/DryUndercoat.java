package painting;

import car.Car;

public class DryUndercoat {
    private double cost;
    private int time; 
    private int powerDemand;

    public DryUndercoat() {
        this.cost = 2.0;
        this.time = 4;
        this.powerDemand = 5;
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

    
    public void process(Car car) {
        System.out.println("Processando Dry Undercoat para o carro: " + car.getId());
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
