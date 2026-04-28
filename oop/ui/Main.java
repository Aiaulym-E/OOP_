package ui;
import java.util.Scanner;

import models.*;
import enums.*;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            
            Admin admin = new Admin(
                    1, "admin", "123",
                    "Aruzhan", 500000
            );

            Teacher teacher = new Teacher(
                    2, "teacher", "123",
                    "Nurlan", 400000,
                    TeacherTitle.PROFESSOR
            );

            Manager manager = new Manager(
                    3, "manager", "123",
                    "Dana", 450000,
                    ManagerType.OR
            );

           
            AdminDashboard adminUI = new AdminDashboard(admin, sc);
            TeacherWorkspace teacherUI = new TeacherWorkspace(teacher, sc);
            ManagerPanel managerUI = new ManagerPanel(manager, sc);

         
            adminUI.show();
            teacherUI.show();     
            managerUI.show();     
        }
    }
}