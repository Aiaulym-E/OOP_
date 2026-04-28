package models;

public class Employee extends User {
    protected String name;
    protected double salary;

    public Employee(int id, String username, String password, String name, double salary) {
        super(id, username, password);
        this.name = name;
        this.salary = salary;
    }

    public void viewProfile() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public String getName() {
        return name;
    }
}