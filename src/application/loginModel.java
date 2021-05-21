package application;
import java.sql.*;


public class loginModel {
	Connection connection;
	 public loginModel () {
		 connection = sqlConnection.Connector(); 
		 if (connection == null) System.exit(1);
	 }
		 
		 public boolean isDbConnected(){
			 try {
				 return !connection.isClosed();
			} catch (SQLException e) {
				e. printStackTrace();
				return false;
			}
 }
		 public boolean isLogin(String user, String pass) throws SQLException {
			 
			    PreparedStatement preparedStatement = null;
				ResultSet resultSet = null;
				String query ="select * from login where username=? and password=?" ;
			 try {
				 preparedStatement = connection.prepareStatement(query);
				 preparedStatement.setString(1, user);
				 preparedStatement.setString(2, pass);
				 
				 resultSet = preparedStatement.executeQuery();
				 if (resultSet.next()) {
					 return true;
				 }
				 
				 else {return false;
				 	 
				 }
			} catch (Exception e) {
				e.printStackTrace();
				return false;
				// TODO: handle exception
			} finally {
				preparedStatement.close();
				resultSet.close();
				
			}
		 }
}
