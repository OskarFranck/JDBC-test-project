import java.sql.*;
public class Main {
    static JDBC db_connection = new JDBC();
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Open a connection
        try(Connection conn = DriverManager.getConnection(db_connection.DB_URL, db_connection.USER, db_connection.PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(db_connection.QUERY)) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getString("model"));
                System.out.print(", First: " + rs.getInt("year"));
                System.out.println(", Last: " + rs.getInt("doors"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}