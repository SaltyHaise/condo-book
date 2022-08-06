package application;

import java.awt.GridBagConstraints;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class HomeController implements Initializable {
    @FXML
    private TextArea Ann1;

    @FXML
    private TextArea Ann2;

    @FXML
    private Label Title;

    @FXML
    private AnchorPane navbar;
    
    @FXML
    private ImageView img;
    
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			FXMLLoader fxmlLoader=new FXMLLoader();
			AnchorPane anchorPane=fxmlLoader.load();
			NavbarController navbarController = fxmlLoader.getController();
			anchorPane = (AnchorPane)FXMLLoader.load(getClass().getResource("Navbar.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
	}
}
