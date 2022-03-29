package StaticMethod;

import java.util.Date;

public class StaticMethod implements Contract{

    public static void meth(){
        method();
    }

    private static void method(){
        System.out.println("static method");
        
    }

    @Override
    public void getContract() {
        System.out.println("Get");
    }

    @Override
    public void cancelContract() {
        System.out.println("Cancel");
    }
}
