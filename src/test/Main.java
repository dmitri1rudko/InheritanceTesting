package test;

public class Main {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        testClass.testMethod();
    }

}

interface TestInterface {
    void testMethod();
}

class TestClass implements TestInterface {
    @Override
    public void testMethod() {
        System.out.println("test interface methof");
    }
}

class AbotherTestClass implements TestInterface {
    @Override
    public void testMethod() {
        System.out.println("Another test");
    }
}

