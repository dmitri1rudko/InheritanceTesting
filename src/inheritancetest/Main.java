package inheritancetest;

public class Main {

    public static void main(String[] args) {
      /*
        Employer employer = new Employer();
        employer.name = "Employer";
        employer.age = 45;
        employer.doEmployerThings();

        Developer developer = new Developer();
        developer.name = "Developer";
        developer.age = 25;
        developer.language = "The best ever language - Java";
        developer.doDeveloperThings();
        */
        Employer employer = new Employer("Employer", 43);
        employer.doEmployerThings();

        Developer developer = new Developer("Java", "Developer", 25);
        developer.doDeveloperThings();



    }

}
