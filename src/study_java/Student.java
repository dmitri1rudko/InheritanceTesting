package study_java;

import java.util.*;


public class Student {

    // Fields
    String firstName;
    String lastName;
    String faculty;
    String gender;
    int age;
    int studentID;
    int studentScore;

    // Empty constructor
    public Student() {
    }

    // Constructor with args
    public Student(String firstName, String lastName, String faculty,
                   String gender, int age, int studentID, int studentScore) {

        this.age = age;
        this.gender = gender;
        this.faculty = faculty;
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentID = studentID;
        this.studentScore = studentScore;
    }

    // Get student birthday method
    public int getBirthday(int age) {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - age;
    }

    // Method
    public void printStudentInfo() {
        System.out.printf("Student name: %s %s", firstName, lastName + "\n");
        System.out.println("Student was born in : " + getBirthday(age));
        System.out.printf("Student faculty: %s", faculty + "\n");
        System.out.printf("Student id: %s", studentID + "\n");
        System.out.printf("Student score: %s",studentScore + "\n");
        System.out.println("------End------");
        System.out.println();
    }

}
