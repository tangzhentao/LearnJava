
class Glyhp {
    void draw () {
        System.out.println("Clyph.draw()");
    }

    Glyhp() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyhp {
    private int radius = 1;
    RoundGlyph (int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    } 

    @Override
    void draw () {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}

public class PloyConstructors {
    public static void main(String[] args) { 
        new RoundGlyph(5);
     }
}