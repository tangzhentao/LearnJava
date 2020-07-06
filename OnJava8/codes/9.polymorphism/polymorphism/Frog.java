
/*
演示 继承和清理
 */

package polymorphism;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("creating Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("dispose Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("creating Description " + s);
    }

    protected void dispose() {
        System.out.println("dispose Description " + s);
    }
}

// 生物
class LivingCreature {
    private Characteristic c = new Characteristic("is alive");
    private Description d = new Description("basic living creature");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose () {
        System.out.println("LivingCreature dispose");
        d.dispose();
        c.dispose();
    }
}

// 动物
class Animal extends LivingCreature {
    private Characteristic c = new Characteristic("has heart");
    private Description d = new Description("animal not vegetable");

    Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose () {
        System.out.println("Animal dispose");
        d.dispose();
        c.dispose();

        super.dispose();
    }
}

// 两栖动物
class Amphibian extends Animal {
    private Characteristic c = new Characteristic("can live in water");
    private Description d = new Description("both water and land");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose () {
        System.out.println("Amphibian dispose");
        d.dispose();
        c.dispose();

        super.dispose();
    }
}

 // 青蛙
class Frog extends Amphibian {
    private Characteristic c = new Characteristic("croaks");
    private Description d = new Description("eat bugs");

    Frog() {
        System.out.println("Frog()");
    }

    @Override
    protected void dispose () {
        System.out.println("Frog dispose");
        d.dispose();
        c.dispose();
        
        super.dispose();
    }

    public static void main(String[] args) { 
        Frog frog = new Frog();
        System.out.println("bye");
        frog.dispose();
     }
}