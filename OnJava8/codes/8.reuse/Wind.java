
// 向上转型

class Instrument {
  public void play() {
    System.out.println(this.toString());
  }

  static void tune(Instrument i) {
    i.play();
  }
}

class Wind extends Instrument {

  public static void main(String[] args) {
    Wind flute = new Wind();
    Instrument.tune(flute);
  }
}
