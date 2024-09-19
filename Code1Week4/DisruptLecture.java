package Code1Week4;

class CellPhone {
    CellPhone() {}

    public void ring(Tune t) {
        t.play();
    }
}

class Tune {
    Tune () {}
    public void play() {
        System.out.println("Tune.play()");
    }
}

class ObnoxiousTune extends Tune {
    ObnoxiousTune() {}

    public void play() {
        System.out.println("ObnoxiousTune.play()");
    }
}

public class DisruptLecture {
    public static void main(String[] args) {
        CellPhone noiseMaker = new CellPhone();
        ObnoxiousTune ot = new ObnoxiousTune();
        noiseMaker.ring(ot); // ot works though Tune called for
    }
}
