
package interfaces.filters;

// 低筒滤波
public class LowPass extends Filter {
    double cutoff; // 界限

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // 哑处理
    }
}