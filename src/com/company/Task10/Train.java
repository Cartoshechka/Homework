package com.company.Task10;

public class Train extends Vehicles {


    /*public String finalDestination;
    public int speed;





    public static void speed (int speed) {
        if (speed >= 300) {
            System.out.println("It's fast train like Sapsan ");
        } else if (speed < 300 && speed >= 59){
            System.out.println("It's middle passenger train like Krasnaya Strela");
        }else {
            System.out.println("It's slow cargo train like Vl80");
        }


    }
    public String toString() {
        return "Train{"
                + "Type='" + type + '\''
                + ", driver=" + driver
               //+ ", howItWorks=" + howItWorks
                + ", finalDestination=" + finalDestination
                +", speed=" + speed
                + '}';
    }*/
    private int railwayCarriage;
    private String finalDestination;
    private int maxSpeed;


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
