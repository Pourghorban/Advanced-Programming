package Exercise_2;

class C extends A {
    private B b;
    public C(int value, String name) {
        super(value);
        this.b = new B(name);
        System.out.println("Class C constructor");
    }
}