package vista;



import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;



public class Main extends Application {
	

	
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
	

		
			FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLProyecto01.fxml"));
			loader.load();
			Parent root = loader.getRoot();
			Scene scene = new Scene(root,1920,1080);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
