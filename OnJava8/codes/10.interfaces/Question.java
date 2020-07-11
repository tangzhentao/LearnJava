
class A {
    
    private interface D {
        void f();
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

public class NestingInterfaces {

    public static void main(String[] args) { 
        A a = new A();
        //A.D ad = a.getD(); // 不能访问私有接口类型 A.D
        // A.DImp2 di2 = a.getD(); // 返回的是接口类型D
        // a.getD().f(); // 不能访问私有接口的方法
        a.getD();

        A a2 = new A();
        a2.receiveD(a.getD()); // 行代码为啥不报错？
    }
}