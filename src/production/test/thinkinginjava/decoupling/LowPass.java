package production.test.thinkinginjava.decoupling;

import production.test.thinkinginjava.decoupling.Filter;
import production.test.thinkinginjava.decoupling.Waveform;

public class LowPass extends Filter {
    private double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public Waveform process(Waveform input){
      return input;
    }
}
