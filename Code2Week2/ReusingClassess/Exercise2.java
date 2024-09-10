package Code2Week2.ReusingClassess;

import Code2Week2.ReusingClassess.Ex2.Detergent;

public class Exercise2 extends Detergent {
    public void scrub() {
        append(" Exercise2.scrub()");
        super.scrub();
    }

    public void sterilize() {
        System.out.println("method sterilize");
    }

}
