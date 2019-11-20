package application.view;

import java.io.IOException;
//import java.util.*;
import application.controller.PetController;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.image.*;
import javafx.scene.control.*;
import javafx.application.Application;
import javafx.event.ActionEvent;


/**
 * The entry point for the Tamagucci application.
 * 
 * <p>
 * It may be weird to think this code can run at all
 * without a main method. The reason it does is
 * <a href="https://stackoverflow.com/questions/44067738/what-is-the-javafx-runtime">
 * because javafx uses jmods to change the Java Runtime.
 * </a>
 * <p>
 * You can gain a better understanding of how this entry
 * point works by reading about 
 * <a href="https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html">
 * the life-cycle in {@code javafx.application.Application}'s documentation
 * </a>
 * </p>
 * 
 * 
 * @author Austin Pena
 *
 */
public class Main extends Application{
	
	private Stage primaryStage;
	
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
		
		this.primaryStage = primaryStage;
			
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
		//TODO:
		System.out.println("TODO: Handle \"Visit Shop\" button.");

	}
	
	// actions taken upon Game button press
	@FXML
	protected void handleGameButton(ActionEvent event) throws IOException{
		//TODO:
		System.out.println("TODO: Handle \"Play a Game\" button.");
		
		//Create game scene
		FXMLLoader loaderMainMenu = new FXMLLoader(getClass().getResource("/GameScene.fxml")); //
		loaderMainMenu.setController(new Game());
		Parent root = loaderMainMenu.load();
			
		Scene gameScene = new Scene(root, 640, 480);
		
		//change scene from main sceen to game scene.
		primaryStage.setTitle("GameBro: Flappy Birb");
		primaryStage.setScene(gameScene);;
	}
	
	public static void main (String [] args) throws Exception {
		
		PetController.handle();
		
		launch(args); // launch the app
		
		
	}

}
