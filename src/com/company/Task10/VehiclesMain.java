package com.company.Task10;

public class VehiclesMain {
    public static void main(String[] args) {

        Plane airbus = new Plane(1, "Lockheed F-117 Nighthawk", 13380, 10420, 1040);
        airbus.vehicleRegistrationCertificate();
        airbus.plane();

        Train lokomotiv = new Train(522,"Сапсан","Санкт петербург",6000,10,300);
        lokomotiv.vehicleRegistrationCertificate();
        lokomotiv.train();


    }
}
