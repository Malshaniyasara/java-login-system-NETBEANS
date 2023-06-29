
package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnect {
    public static Connection connect() throws ClassNotFoundException, SQLException{
        Connection conn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?ze[root ]","","");
        }
        return conn;
    }
}
roDateTimeBehavior=CONVERT_TO_NULL 