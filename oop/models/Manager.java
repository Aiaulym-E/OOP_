package models;

import enums.ManagerType;

public class Manager extends Employee {

    private ManagerType type;

    public Manager(int id,
                   String username,
                   String password,
                   String name,
                   double salary,
                   ManagerType type) {

        super(id, username, password, name, salary);
        this.type = type;
    }

    public void assignCourse() {
        System.out.println(name + " assigned course to teacher.");
    }

    public void approveRegistration() {
        System.out.println(name + " approved student registration.");
    }

    public void generateReport() {
        System.out.println(name + " generated academic report.");
    }

    public ManagerType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Manager: " + name + " | " + type;
    }
}