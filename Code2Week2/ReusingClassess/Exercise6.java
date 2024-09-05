package Code2Week2.ReusingClassess;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
