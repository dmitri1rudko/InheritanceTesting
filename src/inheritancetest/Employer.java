package inheritancetest;

public class Employer {

    String name;
    int age;

    public Employer(){

    }

    public Employer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void doEmployerThings() {
        System.out.println("Pay salary to developers");
        System.out.println(name + age);
    }
}
