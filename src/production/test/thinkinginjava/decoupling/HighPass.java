package production.test.thinkinginjava.decoupling;

public class HighPass extends Filter{
    private double cutoff;
    HighPass(double cutoff){
       this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
        return input;
    }
}
