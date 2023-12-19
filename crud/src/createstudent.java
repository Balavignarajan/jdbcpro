import java.sql.*;
public class createstudent {
	public static void createcollege() throws Exception {
	String url="jdbc:mysql://127.0.0.1:3306/greens";
	String username="root";
	String password="9585";
	String Query="insert into cat values(?,?,?)";
	
	Connection con=DriverManager.getConnection(url, username, password);
	PreparedStatement pst=con.prepareStatement(Query);
	pst.setInt(1, 10272);
	pst.setString(2, "baladhaaraa");
	pst.setString(3, "bala63@gmail.com");
	pst.executeUpdate();
	con.close();
	
	}
		public static void main(String[] args)throws Exception {
			createcollege();
	}

}
