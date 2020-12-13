package com.company.Task8;

public class Person {

    private String name;
    Account account;

    Person(String name, String password) {
        this.name = name;
        account = new Account(password);
    }


    public class Account {
        private String password;

        Account(String password) {
            this.password = password;
        }

        void displayAccount() {
            System.out.println("Owner name:  " + Person.this.name + " Password: " + password);
        }
    }

}
