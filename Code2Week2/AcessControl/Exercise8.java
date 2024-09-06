package Code2Week2.AcessControl;

class Connection {
    private static int connectionCount = 0;
    private int id;

    // Private constructor to prevent direct instantiation
    private Connection() {
        this.id = ++connectionCount;
    }

    public int getId() {
        return id;
    }

    public static Connection createConnection() {
        return new Connection();
    }
}

class ConnectionManager {
    private static final int MAX_CONNECTIONS = 5; // Fixed size of the array
    private static Connection []con = new Connection[MAX_CONNECTIONS];
    private static int currentIndex = 0;

    // Static block to initialize the Connection objects
    static {
        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            con[i] = Connection.createConnection();
        }
    }

    // Static method to get a Connection object
    public static Connection getConnection() {
        if (currentIndex < MAX_CONNECTIONS) {
            return con[currentIndex++];
        } else {
            return null; // No more connections available
        }
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        // Testing the ConnectionManager
        for (int i = 0; i < 7; i++) { // Attempting to get 7 connections
            Connection conn = ConnectionManager.getConnection();
            if (conn != null) {
                System.out.println("Connection: " + conn.getId());
            } else {
                System.out.println("No more connections available.");
            }
        }
    }
}
