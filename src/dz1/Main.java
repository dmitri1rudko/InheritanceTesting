package dz1;

public class Main
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(20);
        rectangle.setWidth(20);
        System.out.println(rectangle.rectangleSquare(rectangle.getWidth(), rectangle.getHeight()));
    }
}
