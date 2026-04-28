package models;

import enums.TeacherTitle;

public class Teacher extends Employee {

    private TeacherTitle title;

    public Teacher(int id,
                   String username,
                   String password,
                   String name,
                   double salary,
                   TeacherTitle title) {

        super(id, username, password, name, salary);
        this.title = title;
    }

    public void manageCourse() {
        System.out.println(name + " is managing course.");
    }

    public void viewStudents() {
        System.out.println(name + " is viewing students.");
    }

    public void putMark() {
        System.out.println(name + " entered marks.");
    }

    public TeacherTitle getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + " | " + title;
    }
}