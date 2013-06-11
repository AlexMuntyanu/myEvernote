import java.sql.*;

import org.h2.tools.Server;

public class Test {
    public static void main(String[] a)
            throws Exception {
        Class.forName("org.h2.Driver");
        Connection connection = DriverManager.
                getConnection("jdbc:h2:~/test", "sa", "");
        // add application code here
        Statement s = connection.createStatement();

        try {
            s.execute("DROP TABLE NOTES");
        } catch (SQLException sqle) {
            System.out.println("Table not found, not dropping");
        }
        s.execute("CREATE TABLE NOTES (ID INT PRIMARY KEY, NOTE_NAME VARCHAR(64), TEXT VARCHAR(64), CREATED DATE (64), UPDATED DATE (64))");
        for (int i=0; i<10; i++){
            StringBuilder sb = new StringBuilder();
            sb.append("INSERT into NOTES (ID,NOTE_NAME,TEXT) values (");
            sb.append(i).append(",")
                    .append("'Name_").append(i).append("',")
                    .append("'some text here'")
                    //.append(",")
                    //.append(new Date(System.currentTimeMillis() - i * 500000000)).append(",")
                    //.append(new Date(System.currentTimeMillis() - i * 10000)).append(")")
                    .append(");");

            PreparedStatement insert = connection.prepareStatement(sb.toString());
            insert.execute();
        }

        PreparedStatement ps = connection.prepareStatement("select * from NOTES");
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()) {
            StringBuilder sb = new StringBuilder(resultSet.getString("NOTE_NAME"));
            sb.append(resultSet.getString("TEXT"))
                    .append(resultSet.getDate("CREATED"))
                    .append(resultSet.getDate("UPDATED"));
            System.out.println(sb);
        }
        connection.close();
    }
}