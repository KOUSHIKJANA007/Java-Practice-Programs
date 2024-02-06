
package com.example.prectice79;

public class Employe {
    private String name;
    private double salary;
    private int age;

    Employe(String name, int age, double salary) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String getEmployees(){
        return "Hello my employee "+name+" at the age "+age+",his salary "+salary;
    }
}
