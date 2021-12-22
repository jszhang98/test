package production.test.thinkinginjava.decoupling;

public class BandPass extends Filter{
    private double lowCutoff, highCutoff;
    BandPass(double lowCut, double highCut){
        this.lowCutoff = lowCut;
        this.highCutoff = highCut;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
