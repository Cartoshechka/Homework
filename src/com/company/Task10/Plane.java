package com.company.Task10;

public class Plane extends Vehicles {

   /* public String fly;
    public int carrying;



    public void type(int carrying) {
        if (carrying > 135) {
            System.out.println("Plane is heavy it can carry a lot of elephats or cars");
        } else if (carrying <= 135 && carrying >= 7) {
            System.out.println("Plane is medium it can carry some cars or elephants");
        } else if (carrying < 7) {
            System.out.println("Plane is light it can carry only a few things");
        }

    }
    public String toString() {
        return "Train{"
                + "Type='" + type + '\''
                + ", driver=" + driver
               // + ", howItWorks=" + howItWorks
                + ", fly=" + fly
                + '}';
    }*/
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
