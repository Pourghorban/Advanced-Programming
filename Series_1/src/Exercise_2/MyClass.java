package Exercise_2;

public class MyClass {

    public MyClass() {
        System.out.println("This is the default constructor message.");
    }

    public MyClass(String message) {
        System.out.println("This is the overloaded constructor message: " + message);
    }

    public static void main(String[] args) {
        MyClass myObject1 = new MyClass();

        MyClass myObject2 = new MyClass("Hello, World!");
    }
}
