package Exercise_6;

public class Dog {

    public void bark() {
        System.out.println("Hoop! Hoop!");
    }

    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hoop!");
        }
    }

    public void bark(double volume) {
        System.out.println("Hoop! Hoop! at volume " + volume);
    }

    public void bark(boolean loud) {
        if (loud) {
            System.out.println("HOOP! HOOP!");
        } else {
            System.out.println("Hoop... Hoop...");
        }
    }

    public void bark(char type) {
        if (type == 'h') {
            System.out.println("Howl! Howl!");
        } else {
            System.out.println("Bark! Bark!");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();

        myDog.bark();
        myDog.bark(3);
        myDog.bark(1.5);
        myDog.bark(true);
        myDog.bark(false);
        myDog.bark('h');
        myDog.bark('b');
    }
}
