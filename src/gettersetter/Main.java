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
        /////////////
        Student pasha = new Student("Pasha",20,"Ivanov","00.00.2002");
        System.out.println("Имя студента - " + pasha.getName());
        System.out.println("Фамилия студента - " + pasha.getLastName());
        System.out.println("Дата рождения студента - " + pasha.getDateOfBirthday());
        System.out.println("Возвраст студента - " + pasha.getAge());

        Student dasha = new Student();
        dasha.setAge(20);
        dasha.setDateOfBirthday("00.00.2002");
        dasha.setLastName("Ivanova");
        dasha.setName("Dasha");
        System.out.println("мя студента - " + dasha.getName());
        System.out.println("Фамилия студента - " + dasha.getLastName());
        System.out.println("Дата рождения студента - " + dasha.getDateOfBirthday());
        System.out.println("Возвраст студента - " + dasha.getAge());
    }
}
