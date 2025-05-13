public class Connecting{
	public static void main(String ...args){
		String url = "jdbc:postgresql://localhost:5432/revisao";
	        try (Connection conn = DriverManager.getConnection(url, "root", "1234");
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