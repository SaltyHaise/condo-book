package application;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SampleController {

	LoadUser load = new LoadUser();
	LoginWindowManager login = new LoginWindowManager();
	CurrentUser currentUser;
	String temp="";
	
    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpwd;

    @FXML
    void onLoginClicked(ActionEvent event) throws IOException{
    	
    	load.GetLoginDataFromFile();
    	
    	//check list of users
    	if (load.getUser().containsKey(txtid.getText())) {
			temp = txtid.getText();
			if (txtpwd.getText().equals(load.getUser().get(temp))) {
				CurrentUser.getInstance().setCurrentUser(temp);
				JOptionPane.showMessageDialog(null, "Login successful.");
				login.gotoLocation("UserMenu.fxml");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect password.");
			}
		} 
		
		//check list of admins
		else if (load.getAdmin().containsKey(txtid.getText())) {
			temp = txtid.getText();
			if (txtpwd.getText().equals(load.getAdmin().get(temp))) {
				CurrentUser.getInstance().setCurrentUser(temp);
				JOptionPane.showMessageDialog(null, "Login successful.");
				login.gotoLocation("AdminMenu.fxml");
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect password.");
			}
		} 
		
		//User not found
		else {	
			temp = "";
			CurrentUser.getInstance().setCurrentUser(temp);
			JOptionPane.showMessageDialog(null, "User does not exist!");
		}
    	
    	
    }
}