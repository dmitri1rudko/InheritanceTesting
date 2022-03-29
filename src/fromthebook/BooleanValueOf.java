package fromthebook;

public class BooleanValueOf
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 5;
        int x = 4;

        System.out.println(valueOf(a == b));
        System.out.println(valueOf(a == x));
    }

    public static Boolean valueOf(boolean b)
    {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

}
