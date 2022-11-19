import java.sql.*;

// standard to split the connection part from the functionality, since in a development environment our settings won't be the same.
// like DB_URL.
public class JDBC {
    // change this to local database connection string
    final String DB_URL = "jdbc:mysql://localhost:3306/test";
    // change this to database username
    final String USER = "root";
    final String PASS = "password";
   // this is just a sample query change to match our sample table.
    final String QUERY = "SELECT id, model, year, doors FROM cars";
}

