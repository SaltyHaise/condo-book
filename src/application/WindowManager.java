package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Modality;

public class WindowManager {
	public void gotoLocation(String fxml) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource(fxml));
			Scene scene2 = new Scene(root,650,400);
			scene2.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stg = new Stage();
			stg.initModality(Modality.APPLICATION_MODAL);
			stg.setScene(scene2);
			stg.setTitle("Welcome, " + CurrentUser.getInstance().getCurrentUser() + "!");
			stg.show();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	public void closeWindow(ActionEvent event) {
		Stage window2 = (Stage)((Node)event.getSource()).getScene().getWindow();
		window2.close();
}
}