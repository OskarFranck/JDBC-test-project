import java.sql.*;

public class JDBC {
    // change this to local database connection string
    static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    // change this to database username
    static final String USER = "root";
    static final String PASS = "password";
   // this is just a sample query change to match our sample table.
    static final String QUERY = "SELECT id, model, year, doors FROM cars";


    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY)) {
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

