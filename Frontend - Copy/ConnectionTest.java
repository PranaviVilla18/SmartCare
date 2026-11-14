
public class ConnectionTest {

    public static void main(String[] args) {

        System.out.println("Connecting to SmartCare Backend...");

        String result = BackendConnection.testConnection();

        System.out.println(result);
    }
}
