package Exercise_9;

class DerivedClass extends BaseClass {
    public DerivedClass() {

        super(0);
        System.out.println("Derived class default constructor called");
    }

    public DerivedClass(int value) {

        super(value);
        System.out.println("Derived class nondefault constructor called with value: " + value);
    }
}