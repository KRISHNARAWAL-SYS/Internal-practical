import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class EmployeeDatabase {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String password = "";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Connected Successfully");

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees WHERE age > 25";

            ResultSet rs = st.executeQuery(query);

            System.out.println("\nEmployees with age greater than 25:");
            System.out.println("------------------------------------");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(
                        "ID: " + id +
                        ", Name: " + name +
                        ", Age: " + age);
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
