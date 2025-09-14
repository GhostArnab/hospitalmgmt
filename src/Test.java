import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

public class Test
{
    public static void main(String[] args)
    {
        String url= "jdbc:mysql://localhost:3306/hospital";
        String username = "root";
        String password = "xxxxxxxxxxx";

        try (Connection connection= DriverManager.getConnection(url, username, password))
        {
            System.out.println("Connected");
            System.out.println(connection);
        }
        catch (SQLException e)
        {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
