package com.classwork.lesson5.Start;

public class PhoneMain {

    public static void main(String[] args) {
        AbstractPhone phone = new ThomasEdisonPhone(1873);
        AbstractPhone phone1 = new Phone(1980);
        AbstractPhone smartPhone = new SmartPhone(200);
        AbstractPhone smartPhone1 = new SmartPhone(2010);

        User user = new User("Vasya");
        user.callAnotherUser("753546344", phone);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        user.callAnotherUser("4454343", phone1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        user.callAnotherUser("2443243", smartPhone);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        user.callAnotherUser("2443241", smartPhone1);

    }


}
