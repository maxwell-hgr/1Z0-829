public class Transactions{
	public static void main(String... args) {
        String url = "jdbc:postgresql://localhost:5432/revisao?user=root&password=1234";
        try (Connection conn = DriverManager.getConnection(url)){
        	conn.setAutoCommit(false);
        	PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM tb_pessoa");
            ResultSet rs = ps.executeQuery(){
            
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }

            conn.commit(); // conn.rollback()
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        }
             
    }
}