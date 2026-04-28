package models;

public class Admin extends Employee {

    public Admin(int id, String username, String password,
                 String name, double salary) {
        super(id, username, password, name, salary);
    }

    public void addUser(User user) {
        System.out.println("User added: " + user.getUsername());
    }

    public void removeUser(User user) {
        System.out.println("User removed: " + user.getUsername());
    }

    public void viewLogs() {
        System.out.println("Viewing logs...");
    }

    @Override
    public String toString() {
        return "Admin: " + name;
    }
}