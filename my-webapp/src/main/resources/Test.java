import java.sql.Connection;
import java.sql.DriverManager;
import org.h2.tools.Server;

public class Test {
    public static void main(String[] a)
            throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
                getConnection("jdbc:h2:~/test", "sa", "");
        // add application code here
        conn.close();
    }
}