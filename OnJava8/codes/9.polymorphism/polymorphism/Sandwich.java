
/*
展示组合、继承和多态在构建顺序上的作用
- 先初始化成员变量
如果没提供默认值，就置为0，
如果提供了默认值，就使用默认值初始化；
- 再调用构造方法
- 先调用父类的构造函数，再调用本类的构造函数
*/ 


package polymorphism;

class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Launch extends Meal {
    Launch() {
        System.out.println("Launch()");
    }
}

class PortalbeLaunch extends Launch {
    PortalbeLaunch() {
        System.out.println("PortalbeLaunch()");
    }
}

public class Sandwich extends PortalbeLaunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    Sandwich () {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) { 
        new Sandwich();
     }
}