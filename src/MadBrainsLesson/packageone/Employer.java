package MadBrainsLesson.packageone;

public class Employer {

    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private void makeZero() {
        this.age = 0;
    }

    public void makeAgeZero() {
        makeZero();
    }
}
