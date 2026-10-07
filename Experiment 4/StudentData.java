import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class StudentData {

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

            ResultSet rs = st.executeQuery(
                    "SELECT * FROM student");

            System.out.println("Student Data:");

            while (rs.next()) {

                int sno = rs.getInt("SNO");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");

                System.out.println(
                        "SNO: " + sno +
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

