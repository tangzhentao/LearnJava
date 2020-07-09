
package interfaces.filters;

public class Waveform {
    private static long conter;
    private final long id = counter++;

    @Override 
    String toString () {
        return "Waveform " + id;
    }
}