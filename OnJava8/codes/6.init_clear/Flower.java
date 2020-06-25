// Calling constructors with "this"

public class Flower {
  int petalCount = 0;
  String s = "initial value";
  Flower(int petals) {
    petalCount = petals;
    System.out.println("constructor w/ int arg only, patalCount = " + petalCount);
  }

  Flower(String ss) {
    s = ss;
    System.out.println("constructor w/ string arg only, s = " + s);
  }

  Flower(String s, int petals) {
    this(petals);
    this.s = s;
    System.out.println("String & int args");
  }

  Flower() {
    this("hi", 47);
    System.out.println("no-arg constructor");
  }

  void printPetaCount() {
    System.out.println("petalCount = " + petalCount + " s = " + s);
  }

  public static void main(String[] args) {
    // Flower f = new Flower(6);
    // Flower f1 = new Flower("rose");
    Flower x = new Flower();
    x.printPetaCount();

  }
}
