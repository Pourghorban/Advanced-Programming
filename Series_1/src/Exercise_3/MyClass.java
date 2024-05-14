package Exercise_3;

public class MyClass {

    public MyClass() {
        System.out.println("This is the default constructor message.");
    }

    public MyClass(String message) {
        System.out.println("This is the overloaded constructor message: " + message);
    }

    public static void main(String[] args) {
        MyClass[] myArray = new MyClass[5];

    }
}

