
// 演示默认包
// 演示访问其他包的protected成员

import com.im.simple.Animal;

class Dog extends Animal {
  Dog() {
    System.out.println("Dog()");
    beat();
  }
}

class Cake {
  public static void main(String[] args) {
    Pie p = new Pie();
    p.f();
    p.protectedFun();


    Animal a = new Animal();
    a.eat();
    // a.beat(); // 不能访问外包中的 protected成员

    Dog d = new Dog();

  }
}
