package painting;

import car.Car;

public class DryFinish {
    private double cost;
    private int time; 
    private int powerDemand;

    public DryFinish() {
        this.cost = 1.0;
        this.time = 2;
        this.powerDemand = 2;
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
        System.out.println("Processando Dry Finish para o carro: " + car.getId());
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
