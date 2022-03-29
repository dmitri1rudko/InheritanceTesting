package dz2;

public class Dog {

    String behaviour;
    String color;
    String name;
    int age;

    public String toDo(){
        return "Dog can bark";
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    public String getBehaviour()
    {
        return behaviour;
    }

    public void setBehaviour(String behaviour)
    {
        this.behaviour = behaviour;
    }
}
