package main;

import car.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos carros devem ser fabricados? ");
        int numberOfCars = scanner.nextInt();

        // Fabricar os carros um de cada vez
        for (int i = 0; i < numberOfCars; i++) {
            Car car = new Car();
            car.manufacture();
            System.out.println(); // Adiciona uma linha em branco entre a fabricação de cada carro
        }

        scanner.close();
    }
}
