package com.company.Task10;

public class Vehicles {
    private String name;
    private int passengers;
    private int weight;


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



