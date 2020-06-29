
package polymorphism.music;

class Wind extends Instrument {
  @Override
  public void play(Note n) {
    System.out.println("Wind.play() " + n);
  }
}
