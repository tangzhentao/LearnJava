

class Parcel4 {

    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {
        private String label;

        PDestination(String whereTo) {
            this.label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination (String s) {
        return new PDestination(s);
    }
    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("tasmania");

        // 私有权限，不能访问
        // Parcel4.PContents pc = p.new PContents();

        Parcel4.PDestination pd = p.new PDestination("new york");
    }
}
