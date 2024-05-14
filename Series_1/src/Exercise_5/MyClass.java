package Exercise_5;

public class MyClass {

    public static void main(String[] args) {
        String[] stringArray = new String[5];

        stringArray[0] = "Hello";
        stringArray[1] = "World";
        stringArray[2] = "This";
        stringArray[3] = "Is";
        stringArray[4] = "Java";

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
