package patterns;

import enums.TeacherTitle;
import models.Admin;
import models.Employee;
import models.Manager;
import models.Teacher;
import enums.ManagerType;

public class AccountFactory {

    public static Employee createAccount(String type) {

        switch(type.toLowerCase()) {

            case "admin":
                return new Admin(
                        1,
                        "admin",
                        "123",
                        "Aruzhan",
                        500000
                );

            case "teacher":
                return new Teacher(
                        2,
                        "teacher",
                        "123",
                        "Nurlan",
                        400000,
                        TeacherTitle.PROFESSOR
                );

            case "manager":
                return new Manager(
                        3,
                        "manager",
                        "123",
                        "Dana",
                        450000,
                        ManagerType.OR
                );

            default:
                return null;
        }
    }
}