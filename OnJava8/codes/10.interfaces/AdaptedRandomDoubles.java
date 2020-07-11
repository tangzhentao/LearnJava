
import java.nio.*;
import java.util.*;

public class AdaptedRandomDoubles implements RandomDoubles, Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) return -1;

        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        AdaptedRandomDoubles a = new AdaptedRandomDoubles(6);
        Scanner s = new Scanner(a);

        while(s.hasNextDouble()) {
            System.out.println(s.nextDouble());
        }
    }
}