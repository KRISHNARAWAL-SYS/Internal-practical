import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Connected Successfully");

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
} 