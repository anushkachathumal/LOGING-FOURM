package application;
import java.awt.TextField;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.util.ResourceBundle;


 
public class loginController implements Initializable {
  public loginModel loginModel = new loginModel();
  
  @FXML
	 private Label isConnected; 
  
  @FXML
	 private TextField txtusername; 
  
  @FXML
	 private TextField txtpassword; 
  
  @Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		if (loginModel.isDbConnected() ) {
			isConnected.setText("Connected");
		} else {
			isConnected.setText(" not Connected");
		}
	}
  public void Login (ActionEvent event  ) {
	 try {
		 if(loginModel.isLogin(txtusername.getText(), txtpassword.getText())) {
			isConnected .setText("username and password is correct " ); 
		 } else {
			 isConnected .setText("username and password is incorrect " ); 
		 }
			
			
	} catch (Exception e) {
		 isConnected .setText("username and password is incorrect " ); 
		// TODO: handle exception
		 e.printStackTrace();
	}
	  
  }
  
}
