

class Bowl {
  Bowl(int marker) {
    System.out.println("Bowl(" + marker + ")");
  }
}

class Bowls {
  Bowl b1;
  Bowl b2;
  {
    b1 = new Bowl(1);
    b2 = new Bowl(2);
    System.out.println("b1 & b2 initialized");
  }

  Bowls() {
    System.out.println("Bowls()");
  }

  Bowls(int marker) {
    System.out.println("Bowls(" + marker + ")");
  }
}

public class InstanceInit {
  public static void main(String[] args) {
    Bowls bs1 = new Bowls();
    Bowls bs2 = new Bowls(2);

  }
}
