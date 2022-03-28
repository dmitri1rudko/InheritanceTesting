package study_java;


public class Main {

    public static void main(String[] args) {

        // Make an object of Student.class
        Student pasha = new Student();
        pasha.gender = "Male";
        pasha.firstName = "Pavel";
        pasha.lastName = "Fedorov";
        pasha.faculty = "MIT";
        pasha.age = 26;
        pasha.studentID = 4356;
        pasha.studentScore = 5;
        pasha.printStudentInfo();

        // Try inheritance
        Male dmitrii = new Male();
        dmitrii.gender = "Male";
        dmitrii.firstName = "Dmitrii";
        dmitrii.lastName = "Bikowsky";
        dmitrii.faculty = "MIT";
        dmitrii.age = 24;
        dmitrii.studentID = 1234;
        dmitrii.studentScore = 4;
        dmitrii.toDoManThings();
        dmitrii.printStudentInfo();


        Female dasha = new Female();
        dasha.gender = "Female";
        dasha.firstName = "Dasha";
        dasha.lastName = "Turbina";
        dasha.faculty = "MIT";
        dasha.age = 34;
        dasha.studentID = 1334;
        dasha.studentScore = 5;
        dasha.madeWomenThings();
        dasha.printStudentInfo();
    }
}
