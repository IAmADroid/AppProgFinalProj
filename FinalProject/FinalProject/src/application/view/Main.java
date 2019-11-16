package application.view;

import java.io.IOException;
import java.util.*;
import application.controller.PetController;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.event.ActionEvent;



public class Main extends Application{
	
	@FXML
	Button visitTheShop; // declare the shop button
	
	@FXML
	Button playAGame; // declare the game button
	
	@FXML
	ImageView petImage; // declare the pet's image
	
	@FXML
	Label healthString;
	
	@FXML
	Label energyString;
	
	@FXML
	Label happinessString;
	
	@FXML
	Label hungerString;
	
	@FXML
	Label hygieneString;
	
	@FXML
	Label coinsString;
	
	// initializes the scene
	public void start(Stage primaryStage) throws IOException{
		
			
		/* load the FXML */
		FXMLLoader loaderMainMenu = new FXMLLoader(getClass().getResource("/Main.fxml")); //
		loaderMainMenu.setController(this);
		Parent root = loaderMainMenu.load();
			
		Scene scene = new Scene(root, 640, 480); // create the scene
		primaryStage.setScene(scene); // set the Scene
		primaryStage.setTitle("Main Menu"); // name the scene
			
		primaryStage.show(); // show the scene
		
		petImage.setImage(new Image("/birman.png"));

		
		
		
	}

	// actions taken upon Shop button press
	@FXML
	protected void handleShopButton(ActionEvent event) throws IOException{
		

	}
	
	// actions taken upon Game button press
	@FXML
	protected void handleGameButton(ActionEvent event) throws IOException{
		

	}
	
	public static void main (String [] args) throws Exception {
		
		PetController.handle();
		
		launch(args); // launch the app
		
		
	}

}
