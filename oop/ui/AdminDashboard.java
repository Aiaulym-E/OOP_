package ui;



import java.util.Scanner;

import models.Admin;
import models.User;


public class AdminDashboard {

    private Admin admin;
    private Scanner sc;

    public AdminDashboard(Admin admin, Scanner sc) {
        this.admin = admin;
        this.sc = sc;
    }

    public void show() {

        boolean running = true;

        while (running) {

            printMenu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addUser();
                    break;

                case 2:
                    removeUser();
                    break;

                case 3:
                    admin.viewLogs();
                    break;

                case 4:
                    admin.viewProfile();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exit Admin Dashboard");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== ADMIN DASHBOARD =====");
        System.out.println("1. Add User");
        System.out.println("2. Remove User");
        System.out.println("3. View Logs");
        System.out.println("4. View Profile");
        System.out.println("5. Exit");
        System.out.print("Choose: ");
    }

    private void addUser() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        User user = new User(id, username, password);
        admin.addUser(user);
    }

    private void removeUser() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        User user = new User(id, "temp", "temp");
        admin.removeUser(user);
    }
}