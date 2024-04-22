package util;

import beans.Student;
import org.example.Config;

public class StudentUtil {
    public static Student fillStudent() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        String className =MenuUtil.requireClassName();
        int age = MenuUtil.requireAge();

        Student student = new Student(name, surname, age, className);
        return student;
    }

    public static void printAllRegisteredStudent() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println((i + 1) + " " + student.getFullInfo());
        }
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        System.out.println("registratation completed succesfully!!!");
        StudentUtil.printAllRegisteredStudent();

    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("Type name,surname or classname");
        Student[] result = findStudents(text);
        for (int i = 0; i < Config.students.length; i++) {
            System.out.println(result[i].getFullInfo());
        }
    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text) || student.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            if (student.getName().contains(text) || student.getSurname().contains(text) || student.getClassName().contains(text)) {
                result[found++] = student;
            }
        }
        return result;

    }

    public static void updateStudent() {
        StudentUtil.printAllRegisteredStudent();
        int i = InputUtil.requireNumber("Which number?");
        Student student = StudentUtil.fillStudent();
        Config.students[i - 1] = student;
    }
}
