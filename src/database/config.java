package database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class config {
    static String url = "jdbc:mysql://localhost:3306/btl_java";
    static String user = "root";
    static String password = "";
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Kết nối thất bại đến cơ sở dữ liệu");
        }
        return con;
    }
    public static void closeConnection(Connection c) {
	try {
            if(c!=null) {
		c.close();
            }
	} catch (Exception e) {
            // TODO: handle exception
		e.printStackTrace();
        }
    }
}  