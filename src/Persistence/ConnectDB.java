package Persistence;

import java.sql.*;

public class ConnectDB {
    public  Connection connection  () throws  ClassNotFoundException, SQLException {
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        var cx = DriverManager.getConnection("jdbc:derby:db/ifp-db");
        return cx;
        }
    public static void deconnect (Connection cx) throws  SQLException {
        cx.close();

    }


}
