package Exercise7;

class Mouse implements Rodent {
    @Override
    public void gnaw() {
        System.out.println("Mouse gnawing");
    }

    @Override
    public void run() {
        System.out.println("Mouse running");
    }
}

class Gerbil implements Rodent {
    @Override
    public void gnaw() {
        System.out.println("Gerbil gnawing");
    }

    @Override
    public void run() {
        System.out.println("Gerbil running");
    }
}

class Hamster implements Rodent {
    @Override
    public void gnaw() {
        System.out.println("Hamster gnawing");
    }

    @Override
    public void run() {
        System.out.println("Hamster running");
    }
}

public class Main {
    public static void main(String[] args) {
        Rodent[] rodents = {
            new Mouse(),
            new Gerbil(),
            new Hamster()
        };

        for (Rodent rodent : rodents) {
            rodent.gnaw();
            rodent.run();
        }
    }
}
