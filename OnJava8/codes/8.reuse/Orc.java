
// 演示尽量使用private，在需要使用protected的地方，把成员private，把方法protected

class Villain {
  private String name;

  protected void set(String nm) {
    name = nm;
  }

  Villain(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I'm a Villain and my name is " + name;
  }
}

public class Orc extends Villain {
  private int orcNumber ;

  public Orc(String name, int num) {
    super(name);
    this.orcNumber = num;
  }

  public void change(String name, int num) {
    set(name);
    this.orcNumber = num;
  }

  @Override
  public String toString() {
    return "Orc " + orcNumber + ": " + super.toString();
  }

  public static void main(String[] args) {
    Orc orc = new Orc("Lim", 12);
    System.out.println(orc);
    orc.change("Bob", 19);
    System.out.println(orc);
  }
}
