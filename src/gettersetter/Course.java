package gettersetter;

public class Course {
    String nameOfCourse;
    int idNumber;
    String nameOfMentor;
    String startOfCourse;

    public Course(){

    }

    public Course(String nameOfCourse, int idNumber, String nameOfMentor, String startOfCourse) {
        this.nameOfCourse = nameOfCourse;
        this.idNumber = idNumber;
        this.nameOfMentor = nameOfMentor;
        this.startOfCourse = startOfCourse;
    }

    public String getNameOfCourse() {
        return nameOfCourse;
    }

    public void setNameOfCourse(String nameOfCourse) {
        this.nameOfCourse = nameOfCourse;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getNameOfMentor() {
        return nameOfMentor;
    }

    public void setNameOfMentor(String nameOfMentor) {
        this.nameOfMentor = nameOfMentor;
    }

    public String getStartOfCourse() {
        return startOfCourse;
    }

    public void setStartOfCourse(String startOfCourse) {
        this.startOfCourse = startOfCourse;
    }
}
