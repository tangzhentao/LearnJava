

// 演示使用带参的构造函数初始化父类

class Game {
    Game(int i) {
        System.out.println("Game constructor " + i);
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor " + i);
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor ");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
