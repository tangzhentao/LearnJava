
class A {
    interface B {
        void f();
    }    

    public class BImp implements B {
        @Override
        public void f() {}
    }

    public class BImp2 implements B {
        @Override
        public void f() {}
    }

    public interface C {
        void f();
    }    

    class CImp implements C {
        @Override
        public void f() {}
    }

    private class CImp2 implements C {
        @Override
        public void f() {}
    }

    private interface D {
        void f();
    }    

    private class DImp implements D {
        @Override
        public void f() {}
    }

    public class DImp2 implements D {
        @Override
        public void f() {}
    }

    public D getD () {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }

    public interface H {
        void f();
    }

    void g();

    // private interface I {} // 接口中的声明的权限不能是私有的
}

public class NestingInterfaces {

    public class BImp implements A.B {

        @Override
        public void f() {}
    }

    public class CImp implements A.C {

        @Override
        public void f() {}
    }

    // 不能实现其他类中的私有接口
    /*
    public class DImp implements A.D {

        @Override
        public void f() {}
    }
    */

    class EImp implements E {

        @Override
        public void g() {}
    }

    class EGImp implements E.G {

        @Override
        public void f() {}
    }

    class EImp2 implements E {

        @Override
        public void g() {}

        class EGImp implements E.G {

            @Override
            public void f() {}
        }
    }

    public static void main(String[] args) { 
        A a = new A();
        //A.D ad = a.getD(); // 不能访问私有接口类型 A.D
        // A.DImp2 di2 = a.getD(); // 返回的是接口类型D
        // a.getD().f(); // 不能访问私有接口的方法
        a.getD();

        A a2 = new A();
        a2.receiveD(a.getD());


    }
}