



package interfaces.filters;

// 带通滤波
public class BandPass extends Filter {
    double lowCutoff, hightCutoff; // 界限

    public BandPass(double lowCutoff, double hightCutoff) {
        this.lowCutoff = lowCutoff;
        this.hightCutoff = hightCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // 哑处理
    }
}