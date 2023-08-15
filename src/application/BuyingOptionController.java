package application;

import java.io.IOException;
import java.net.URL;

import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class BuyingOptionController implements Initializable {

	@FXML
	public RadioButton btnsA1;
	@FXML
	public RadioButton btnsA2;
	@FXML
	public RadioButton btnsA3;
	@FXML
	public RadioButton btnsA4;
	@FXML
	public RadioButton btnsA5;
	@FXML
	public RadioButton btnsA6;
	@FXML
	public RadioButton btnsB1;
	@FXML
	public RadioButton btnsB2;
	@FXML
	public RadioButton btnsB3;
	@FXML
	public RadioButton btnsB4;
	@FXML
	public RadioButton btnsB5;
	@FXML
	public RadioButton btnsB6;
	@FXML
	public RadioButton btnsC1;
	@FXML
	public RadioButton btnsC2;
	@FXML
	public RadioButton btnsC3;
	@FXML
	public RadioButton btnsC4;
	@FXML
	public RadioButton btnsC5;
	@FXML
	public RadioButton btnsC6;
	@FXML
	public RadioButton btnsD1;
	@FXML
	public RadioButton btnsD2;
	@FXML
	public RadioButton btnsD3;
	@FXML
	public RadioButton btnsD4;
	@FXML
	public RadioButton btnsD5;
	@FXML
	public RadioButton btnsD6;
	@FXML
	public RadioButton btnH1;
	@FXML
	public RadioButton btnH2;
	@FXML
	public RadioButton btnH3;
	@FXML
	public RadioButton btnT1;
	@FXML
	public RadioButton btnT2;
	@FXML
	public RadioButton btnT3;
	
	@FXML
	public DatePicker datePick;
	@FXML
	public Label lblHall;
	@FXML
	public Label lblTime;
	@FXML
	public Label lblSeat;
	@FXML
	public Label lblStatus;
	@FXML
	public Label lblDate;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	public void radioSelect1(ActionEvent event) {
		String message ="";
		if(btnsA1.isSelected()) {
			message="A1";
		}
		if(btnsA2.isSelected()) {
			message="A2";
		}
		if(btnsA3.isSelected()) {
			message="A3";
		}
		if(btnsA4.isSelected()) {
			message="A4";
		}
		if(btnsA5.isSelected()) {
			message="A5";
		}
		if(btnsA6.isSelected()) {
			message="A6";
		}
		
		if(btnsB1.isSelected()) {
			message="B1";
		}
		if(btnsB2.isSelected()) {
			message="B2";		
		}
		if(btnsB3.isSelected()) {
			message="B3";
		}
		if(btnsB4.isSelected())
		{
			message="B4";
		}
		if(btnsB5.isSelected()) {
			message="B5";		
		}
		if(btnsB6.isSelected()) {
			message="B6";		
		}
		if(btnsC1.isSelected()) {
			message="C1";		
		}
		if(btnsC2.isSelected()) {
			message="C2";		
		}
		if(btnsC3.isSelected()) {
			message="C3";		
		}
		if(btnsC4.isSelected()) {
			message="C4";		
		}
		if(btnsC5.isSelected()) {
			message="C5";		
		}
		if(btnsC6.isSelected()) {
			message="C6";		
		}
		if(btnsD1.isSelected()) {
			message="D1";		
		}
		if(btnsD2.isSelected()) {
			message="D2";		
		}
		if(btnsD3.isSelected()) {
			message="D3";		
		}
		if(btnsD4.isSelected()) {
			message="D4";		
		}
		if(btnsD5.isSelected()) {
			message="D5";		
		}
		if(btnsD6.isSelected()) {
			message="D6";
		}
		lblSeat.setText(message);
	}
	
	public void radioSelect2(ActionEvent event) {
		String message2 ="";
		if(btnH1.isSelected()) {
			message2+=btnH1.getText()+"\n";
		}
		if(btnH2.isSelected()) {
			message2+=btnH2.getText()+"\n";
		}
		if(btnH3.isSelected()) {
			message2+=btnH3.getText()+"\n";
		}
		lblHall.setText(message2);
	}
	
	public void radioSelect3(ActionEvent event) {
		String message3 ="";
		if(btnT1.isSelected()) {
			message3+=btnT1.getText()+"\n";
		}
		if(btnT2.isSelected()) {
			message3+=btnT2.getText()+"\n";
		}
		if(btnT3.isSelected()) {
			message3+=btnT3.getText()+"\n";
		}
		lblTime.setText(message3);
	}
	

	
	public void ShowDate(ActionEvent event) {
		LocalDate ld = datePick.getValue();
		lblDate.setText("Date: "+ld.toString());
		
	}
	
	
	
	
	public void Confirm(ActionEvent event) throws IOException {
		
			((Node)event.getSource()).getScene().getWindow().hide();
			lblStatus.setText("Purchase Success");
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Confirmation.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
	}

	
	
	
	public void Back(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/HomePage.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public void Logout(ActionEvent event) throws Exception {
		((Node)event.getSource()).getScene().getWindow().hide();
		Stage primaryStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("/application/Login.fxml"));
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
