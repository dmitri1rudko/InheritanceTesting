package gettersetter;

public class Student {
    String name;
    int age;
    String lastName;
    String dateOfBirthday;

    public Student(){

    }

    public Student(String name, int age, String lastName, String dateOfBirthday) {
        this.name = name;
        this.age = age;
        this.lastName = lastName;
        this.dateOfBirthday = dateOfBirthday;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

}
