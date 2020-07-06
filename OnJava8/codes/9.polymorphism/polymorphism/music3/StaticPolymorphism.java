
// 演示静态方法，不能多态

class StaticSuper {
    public static String staticGet () {
        return "static base";
    }

    public String dynamicGet () {
        return "dynamic base";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet () {
        return "static detrived";
    }

    public String dynamicGet () {
        return "dynamic detrived";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) { 
        StaticSuper ss = new StaticSub();
        System.out.println(ss.staticGet() + ", " + ss.dynamicGet());
        StaticSub ds = new StaticSub();
        System.out.println(ds.staticGet() + ", " + ds.dynamicGet());
     }
}