package application.view;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Game extends Application{
	
	Stage primaryStage;
	Scene mainScene;
	
	public Game(Stage primaryStage, Scene mainScene) {
		this.primaryStage = primaryStage;
		this.mainScene = mainScene;
	}
	
	
	@FXML
	protected void handleGoBackButton(ActionEvent event) throws IOException{
		//change scene to main scene.
		primaryStage.setTitle("Main again.");
		primaryStage.setScene(mainScene);;
	}
	

	/**
	 * This method is not necessary because this
	 * class will not be used as an entry point.
	 */
	@Override
	public void start(Stage arg0) throws Exception {
	}

}
