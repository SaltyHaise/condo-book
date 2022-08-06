package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class NavbarController {

	WindowManager windowManager = new WindowManager();
	
	@FXML
	private Label Logo;

	@FXML
	private Label BBQ;

	@FXML
	private Label Room;

	@FXML
	private Label Court;

	@FXML
	private Label Bookings;

	@FXML
	private Label Others;

	@FXML
	void onBBQClicked(MouseEvent event) {
		windowManager.gotoLocation("BBQpit.fxml");
	}

	@FXML
	void onBookingClicked(MouseEvent event) {
		windowManager.gotoLocation("yourbooking.fxml");
	}

	@FXML
	void onCourtClicked(MouseEvent event) {
		windowManager.gotoLocation("Tenniscourt.fxml");
	}
	
	@FXML
	void onLogoClicked(MouseEvent event) {
		windowManager.gotoLocation("UserMenu.fxml");
	}

	@FXML
	void onRoomClicked(MouseEvent event) {
		windowManager.gotoLocation("Functionroom.fxml");
	}
	
	@FXML
	void onOthersClicked(MouseEvent event) {
		windowManager.gotoLocation("Logout.fxml");
	}
}
