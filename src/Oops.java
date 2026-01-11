public class Oops {
    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass(2);
    }
};


class ParentClass {
    int a;
    ParentClass(int a) {
        this.a = a;
    }
}

class ChildClass extends ParentClass {
    int b;
    ChildClass(int b, int a) {
        super(a);
        this.b = b;
    }
}