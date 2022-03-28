package gettersetter;

public class Main {
    public static void main(String[] args) {
        Course course = new Course( );
        course.setNameOfCourse("Java");
        course.setStartOfCourse("02-03-2022");
        course.setIdNumber(1234);
        course.setNameOfMentor("Nurbek");

        Student student= new Student();
        student.setName("Dmitrii");
        student.setAge(24);
        student.setLastName("Rudko");
        student.setDateOfBirthday("00-00-1998");

        System.out.println(course.getNameOfCourse() + " " +
                course.getStartOfCourse() + " " +
                course.getIdNumber() + " " +
                course.getNameOfMentor());

        System.out.println(student.getName() + " " +
                student.getLastName() + " " +
                student.getAge() + " " +
                student.getDateOfBirthday());
    }
}
