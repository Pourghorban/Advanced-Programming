package Exercise_13;

public class Main {
    public static void main(String[] args) {
        MyDerivedClass obj = new MyDerivedClass();

        obj.myMethod();
        obj.myMethod(10);
        obj.myMethod("Hello");
        obj.myMethod(3.14);
    }
}