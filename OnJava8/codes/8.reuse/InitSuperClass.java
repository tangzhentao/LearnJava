

// 演示初始化父类
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

class InitSuperClass extends Drawing {
    public InitSuperClass () {
        System.out.println("InitSuperClass constructor");
    }

    public static void main(String[] args) {
        InitSuperClass i = new InitSuperClass();
    }
}
