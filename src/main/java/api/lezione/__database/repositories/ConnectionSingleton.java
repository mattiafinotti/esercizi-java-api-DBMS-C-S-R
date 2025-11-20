package api.lezione.__database.repositories;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionSingleton {
    private static ConnectionSingleton instance;
    public static ConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new ConnectionSingleton();
        }
            return instance;
    }

    private ConnectionSingleton() {}

    public Connection getConnection() throws SQLException {

            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setPort(3306);
            ds.setUser("Mattia");
            ds.setPassword("root1999!");
            ds.setDatabaseName("lezione_api_1");
            ds.setUseSSL(false);
            ds.setAllowPublicKeyRetrieval(true);

            return ds.getConnection();


    }
}
