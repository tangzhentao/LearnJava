
package interfaces.filters;

// 高通滤波
class HightPass extends Filter {
    double cutoff; // 界限

    public HightPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input; // 哑处理
    }
}