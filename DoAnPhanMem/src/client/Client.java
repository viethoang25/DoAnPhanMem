package client;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Client extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = new AnchorPane();
			Scene scene = new Scene(root, 400, 400);
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Client.class.getResource("view/MainView.fxml"));

			root = loader.load();
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
