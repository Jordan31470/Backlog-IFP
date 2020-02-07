package Persistence;

import java.sql.*;


public class ReporterDAO {
    public static  void read (int id) throws SQLException, ClassNotFoundException {
        ConnectDB connectDB = new ConnectDB();
        Connection cx = connectDB.connection();
        PreparedStatement stmt = cx.prepareStatement("Select* from reporter Where id = ?");
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            int idReporter = rs.getInt(1);
            String pseudo = rs.getString(2);
            int credit = rs.getInt(3);
            System.out.println(pseudo);
            System.out.println(credit+ '\n');
        }
        cx.close();
    }
}

