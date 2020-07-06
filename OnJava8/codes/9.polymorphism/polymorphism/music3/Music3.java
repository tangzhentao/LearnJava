
package polymorphism.music3;
import polymorphism.music.Note;

class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }

    String what() {
        return "Instrumnet";
    }

    void adjust() {
        System.out.println("Instrumnet.adjust()");
    }
}

class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    String what() {
        return "Wind";
    }

    void adjust() {
        System.out.println("Wind.adjust()");
    } 
}

class Percussion extends Instrument {
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    String what() {
        return "Percussion";
    }

    void adjust() {
        System.out.println("Percussion.adjust()");
    } 
}

class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    String what() {
        return "Stringed";
    }

    void adjust() {
        System.out.println("Stringed.adjust()");
    } 
}

class Brass extends Instrument {
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    String what() {
        return "Brass";
    }

    void adjust() {
        System.out.println("Brass.adjust()");
    } 
}

class Woodwind extends Instrument {
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    String what() {
        return "Woodwind";
    }

    void adjust() {
        System.out.println("Woodwind.adjust()");
    } 
}

public class Music3 {

    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i: e) {
            tune(i);
        }
    }


    public static void main(String[] args) { 
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };

        tuneAll(orchestra);
     }
}