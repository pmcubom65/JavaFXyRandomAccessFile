package controlador;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import modelo.*;
import vista.*;

public class ControladorPrimero {

	@FXML
	private TextField t1;

	@FXML
	private TextField t2;

	@FXML
	private Button botonInicio;
	@FXML
	private Label mensajes;

	@FXML
	public void hacerClick(ActionEvent event) throws IOException {

		if (!t1.getText().isEmpty() && !t2.getText().isEmpty()) {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("FXMLSegunda.fxml"));

			Parent nuevoparent = loader.load();
			Scene nuevaescena = new Scene(nuevoparent, 1920, 1080);
			nuevaescena.getStylesheets().add(getClass().getResource("application1.css").toExternalForm());

			ControladorSegundo micontrolador = loader.getController();
			micontrolador.datosIniciales(t1.getText(), t2.getText());

			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
		
			window.setScene(nuevaescena);

			window.show();
		} else {

			mensajes.setText("Tiene que poner ambos nombres para empezar");

		}

	}

}
