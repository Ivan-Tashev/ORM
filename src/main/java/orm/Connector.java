package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static Connection connection;

    public static Connection getConnection(String type, String vendor, String user, String pass,
                                           String host, String port, String dbName) throws SQLException {
        return connection = DriverManager.getConnection(
                type + ":" + vendor + "://" + host + ":" + port + "/" + dbName, user, pass);
    }
}
