package com.homework.task10;

public class Plane extends Vehicles {

   private final int carryng;
   private final int maxSpeed;

    public Plane(int passengers, String name, int weight, int carryng, int maxSpeed){
        super(passengers, name, weight);
        this.carryng = carryng;
        this.maxSpeed = maxSpeed;

    }
    public void plane(){

        System.out.println("Грузоподьемность самолёта: "+ carryng);
        System.out.println("Максимальная скорость самолёта составляет: " + maxSpeed);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
