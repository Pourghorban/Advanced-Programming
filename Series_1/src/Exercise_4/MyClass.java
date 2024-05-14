package Exercise_4;

public class MyClass {

    public MyClass() {
        System.out.println("This is the default constructor message.");
    }

    public MyClass(String message) {

        System.out.println("This is the overloaded constructor message: " + message);
    }

    public static void main(String[] args) {
        MyClass[] myArray = new MyClass[5];

        myArray[0] = new MyClass();
        myArray[1] = new MyClass("Message 1");
        myArray[2] = new MyClass("Message 2");
        myArray[3] = new MyClass();
        myArray[4] = new MyClass("Message 3");

    }
}

