package interfaces.music5;
import polymorphism.music.Note;

interface Instrumnet {
    int VALUE = 5;

    default void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    default void adjust() {
        System.out.println("adjusting " + this);
    }
}

class Wind implements Instrumnet {
    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrumnet {
    @Override
    public String toString() {
        return "Percussion";
    }
}


class Stringed implements Instrumnet {
    @Override
    public String toString() {
        return "Stringed";
    }
}


class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {

    static void tune(Instrumnet i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrumnet[] e) {
        for(Instrumnet i: e) {
            tune(i);
        }
    }

    public static void main(String[] args) { 
        Instrumnet[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };

        tuneAll(orchestra);
    }
}