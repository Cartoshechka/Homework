package com.homework.task22;

public class Staff implements Comparable<Staff> {
    String name, surname;
    Long salary;

    public Staff(String name, String surname, Long salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Staff o) {
        if (this.salary > o.salary) {
            return -1;
        } else if (this.salary < o.salary) {
            return 1;
        }
        return 0;
    }
}
