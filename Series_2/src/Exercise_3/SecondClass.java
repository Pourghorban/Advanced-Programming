package Exercise_3;

class SecondClass {
    private MyClass myObject;

    public MyClass getMyObject() {
        if (myObject == null) {
            myObject = new MyClass();
        }
        return myObject;
    }
}