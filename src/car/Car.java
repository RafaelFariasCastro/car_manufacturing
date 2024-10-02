package car;

import assembly.BodyFrame;
import assembly.Doors;
import assembly.Exhaust;
import assembly.PowerTrain;
import assembly.Radiator;
import assembly.Roof;
import assembly.Steering;
import assembly.Tires;
import assembly.Wheels;
import assembly.Brakes;
import chassiswelding.Axles;
import chassiswelding.Undercarriage;
import chassiswelding.FuelTank;
import painting.PaintUndercoat;
import painting.DryUndercoat;
import painting.PaintFinish;
import painting.DryFinish;

public class Car {
    private static int idCounter = 1;
    private int id;
    private double totalCost;
    private int totalTime; // em segundos
    private int totalPowerDemand;

    public Car() {
        this.id = idCounter++;
        this.totalCost = 0.0;
        this.totalTime = 0;
        this.totalPowerDemand = 0;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public int getTotalPowerDemand() {
        return totalPowerDemand;
    }

    // Métodos para adicionar aos totais
    public void addCost(double cost) {
        this.totalCost += cost;
    }

    public void addTime(int time) {
        this.totalTime += time;
    }

    public void addPowerDemand(int powerDemand) {
        this.totalPowerDemand += powerDemand;
    }

    // Método para iniciar o processo de fabricação
    public synchronized void manufacture() {
        System.out.println("Iniciando fabricação do carro ID: " + this.id);

        // Processamento pelo pacote ChassisWelding
        Axles axles = new Axles();
        axles.process(this);

        Undercarriage undercarriage = new Undercarriage();
        undercarriage.process(this);

        FuelTank fuelTank = new FuelTank();
        fuelTank.process(this);

        // Processamento pelo pacote Painting
        PaintUndercoat paintUndercoat = new PaintUndercoat();
        paintUndercoat.process(this);

        DryUndercoat dryUndercoat = new DryUndercoat();
        dryUndercoat.process(this);

        PaintFinish paintFinish = new PaintFinish();
        paintFinish.process(this);

        DryFinish dryFinish = new DryFinish();
        dryFinish.process(this);

        // Processamento pelo pacote Assembly
        BodyFrame bodyFrame = new BodyFrame();
        bodyFrame.process(this);

        Roof roof = new Roof();
        roof.process(this);

        Doors doors = new Doors();
        doors.process(this);

        PowerTrain powerTrain = new PowerTrain();
        powerTrain.process(this);

        Radiator radiator = new Radiator();
        radiator.process(this);

        Exhaust exhaust = new Exhaust();
        exhaust.process(this);

        Steering steering = new Steering();
        steering.process(this);

        Brakes brakes = new Brakes();
        brakes.process(this);

        Wheels wheels = new Wheels();
        wheels.process(this);

        Tires tires = new Tires(); 
        tires.process(this);

        System.out.println("Fabricação do carro ID: " + this.id + " concluída.");
        System.out.printf("Custo Total (ID do carro #%d#): %.1f%n", this.id, this.totalCost);
        System.out.printf("Tempo Total (ID do carro #%d#): %d horas%n", this.id, this.totalTime);
        System.out.printf("Demanda de Energia Total (ID do carro #%d#): %d%n", this.id, this.totalPowerDemand);
    }
}
