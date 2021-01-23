package com.homework.task10;

public class Vehicles {
    private final String name;
    private final int passengers;
    private final int weight;


    public Vehicles(int passengers, String name, int weight) {
        this.passengers = passengers;
        this.name = name;
        this.weight = weight;

    }

    public void vehicleRegistrationCertificate() {
        System.out.println("Вместимость людей - " + passengers);
        System.out.println("Название - " + name);
        System.out.println("Вес - " + weight);
    }


}



