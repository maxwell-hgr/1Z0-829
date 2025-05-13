import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IntroducingInterfaces {
    public static void main(String... args) {
        String url = "jdbc:postgresql://localhost:5432/revisao?user=root&password=1234";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM tb_pessoa");
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}