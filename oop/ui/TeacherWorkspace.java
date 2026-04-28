package ui;

import java.util.Scanner;

import models.Teacher;




public class TeacherWorkspace {

    private Teacher teacher;
    private Scanner sc;

    public TeacherWorkspace(Teacher teacher, Scanner sc) {
        this.teacher = teacher;
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
                    teacher.viewStudents();
                    break;

                case 2:
                    teacher.manageCourse();
                    break;

                case 3:
                    teacher.viewProfile();
                    break;

                case 4:
                    running = false;
                    System.out.println("Exit Teacher Workspace");
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private void printMenu() {
        System.out.println("\n===== TEACHER WORKSPACE =====");
        System.out.println("1. View Students");
        System.out.println("2. Manage Course");
        System.out.println("3. View Profile");
        System.out.println("4. Exit");
        System.out.print("Choose: ");
    }
}