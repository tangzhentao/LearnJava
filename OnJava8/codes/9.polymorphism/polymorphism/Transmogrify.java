/*
##### 使用继承设计
使用继承表达行为的差异，使用属性表达状态的变化；
*/ 

class Actor {
    void act() {}
}

class HappyActor extends Actor {
    @Override
    void act () {
        System.out.println("happy actor");
    }
}

class SadActor extends Actor {
    @Override
    void act () {
        System.out.println("sad actor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    void change() {
        actor = new SadActor();
    }

    void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) { 
        Stage s = new Stage();
        s.performPlay();
        s.change();
        s.performPlay();
    }
}