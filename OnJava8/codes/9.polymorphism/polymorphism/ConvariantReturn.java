
/*
演示 协变返回类型

子类在重写父类方法时，返回类型可以和 父类中方法的返回类型 不一样，可以是父类方法返回类型的子类
*/ 

class Grain {
    @Override
    public  String toString () {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public  String toString () {
        return "Wheat";
    }
}

class Mill {
    Grain process () {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process () {
        return new Wheat();
    }
}

public class ConvariantReturn {
    public static void main(String[] args) { 
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        g = m.process();
        System.out.println(g);
    }
}