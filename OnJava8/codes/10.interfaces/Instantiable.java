
abstract class Uninstantiable {
    abstract void f();
    abstract int g();
}

public class Instantiable extends Uninstantiable {
    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 1;
    }

    public static void main(String[] args) { 
        Uninstantiable ui = new Instantiable();
    }
}