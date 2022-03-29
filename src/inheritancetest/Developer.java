package inheritancetest;

public class Developer extends Employer {

    private String language;

    public Developer(String language, String name, int age) {
        super(name, age);
        this.language = language;
    }

    public Developer(){

    }

    public void doDeveloperThings() {
        System.out.println("Develop cool things");
        System.out.println(language);
        System.out.println(name + age);
    }

}
