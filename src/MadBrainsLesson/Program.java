package MadBrainsLesson;

import MadBrainsLesson.packageone.Developer;
import MadBrainsLesson.packageone.Employer;

public class Program {
    public static void main(String[] args) {
        Employer employer = new Employer();
        employer.setName("Employer");
        employer.setAge(22);
        System.out.println(employer.getAge());
        employer.makeAgeZero();
        System.out.println(employer.getAge());
        System.out.println(employer.getName());

        Developer developer = new Developer();
        developer.setAge(22);
        System.out.println(developer.getAge());
        developer.makeAgeZero();
        System.out.println(developer.getAge());
        developer.setName("Developer");
        developer.setLanguage("Java");
        System.out.println(developer.getName());
        System.out.println(developer.getLanguage());
    }
}
