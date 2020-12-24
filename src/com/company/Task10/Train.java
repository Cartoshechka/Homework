package com.company.Task10;

public class Train extends Vehicles {

    private final int railwayCarriage;
    private final String finalDestination;
    private final int maxSpeed;


    public Train(int passengers, String name,String finalDestination, int weight, int railwayСarriage, int maxSpeed) {
        super(passengers, name, weight);
        this.railwayCarriage = railwayСarriage;
        this.finalDestination = finalDestination;
        this.maxSpeed = maxSpeed;

    }
    public void train(){
        System.out.println("Поезд едет с " + railwayCarriage + " вагонами");
        System.out.println("Поезд едет в " + finalDestination);
        System.out.println("Максимальная скорость поезда составляет: " + maxSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }


}
