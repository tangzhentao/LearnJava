
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    Shared () {
        System.out.println("creating " + this);
    }

    public void addRef () {
        refcount++;
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    Composing(Shared shared) {
        System.out.println("creating " + this);
        this.shared = shared;
        shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) { 
        Shared shared = new Shared();

        Composing[] composings = {
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
            new Composing(shared),
        };

        for (Composing c: composings) {
            c.dispose();
        }
        
    }
}