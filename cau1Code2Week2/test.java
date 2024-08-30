package cau1Code2Week2;

import cau1Code2Week2.debug.Debug;
import main.java.com.mycompany.*;

public class test {
    public static void main(String[] args) {
        NameNumber n = new NameNumber("Long", "1000000");
        System.out.println(n.getTelNumber());

        Debug d = new Debug();
        d.debug("he long");
    }
}
