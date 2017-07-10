import java.sql.*;

public class DatabaseConnect {
    public static void main(String[] args) throws SQLException{
        String jdbcDriver = "com.mysql.jdbc.Driver";
        String dbUrl = "jdbc:mysql://localhost:3306/student";
        try {
            Class.forName(jdbcDriver);
            Connection conn = DriverManager.getConnection(dbUrl, "root", "password");
            Statement stmt = conn.createStatement();

            /* Student(name, course, marks, college)*/
            String query = "Select * from student";

            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("Name"));
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}