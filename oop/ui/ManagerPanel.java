package ui;

import java.util.Scanner;
import models.Manager;

public class ManagerPanel {

    private Manager manager;
    private Scanner sc;

    public ManagerPanel(Manager manager, Scanner sc) {
        this.manager = manager;
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
                    manager.assignCourse();
                    break;

                case 2:
                    manager.approveRegistration();
                    break;

                case 3:
                    manager.generateReport();
                    break;

                case 4:
                    manager.viewProfile();
                    break;

                case 5:
                    running = false;
                    System.out.println("Exit Manager Panel");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== MANAGER PANEL =====");
        System.out.println("1. Assign Course");
        System.out.println("2. Approve Registration");
        System.out.println("3. Generate Report");
        System.out.println("4. View Profile");
        System.out.println("5. Exit");
        System.out.print("Choose: ");
    }
}