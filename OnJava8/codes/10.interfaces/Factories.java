

// 演示 接口和工厂方法模式

interface Service {
    void m1();
    void m2();
}

interface ServiceFactory {
    Service getService();
}

class Service1 implements Service {

    @Override
    public void m1 () {
        System.out.println("Service1.m1()");
    }
    public void m2 () {
        System.out.println("Service1.m2()");
    }
}

class Service1Factory implements ServiceFactory {
    @Override
    public Service getService () {
        return new Service1();
    }
}

class Service2 implements Service {

    @Override
    public void m1 () {
        System.out.println("Service2.m1()");
    }
    public void m2 () {
        System.out.println("Service2.m2()");
    }
}

class Service2Factory implements ServiceFactory {
    @Override
    public Service getService () {
        return new Service2();
    }
}

public class Factories {

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.m1();
        s.m2();
    }
    public static void main(String[] args) { 
        serviceConsumer(new Service1Factory());
        serviceConsumer(new Service2Factory());
    }
}