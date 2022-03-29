package dz2;

public class Cat {

    String behaviour;
    String color;
    String name;
    int age;

    public String toDo(){
        return "Cat can catch mice";
    }

    public String getBehaviour()
    {
        return behaviour;
    }

    public void setBehaviour(String behaviour)
    {
        this.behaviour = behaviour;
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
}
