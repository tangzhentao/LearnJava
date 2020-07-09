
package interfaces.filters;

public class Filter {
    
    public String name() {
        reutrn getClass().getSimpleClass();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}