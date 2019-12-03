package application.view;


import java.io.IOException;
import java.util.*;
import application.controller.*;
import application.model.*;
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
 * 
 * @author Austin Pena
 *
 */
public class Main extends Application{
	
	private Stage primaryStage;
	private Scene mainScene;
	
	@FXML
	Button visitTheShop; // declare the shop button
	
	@FXML
	Button playAGame; // declare the game button
		
	@FXML
	Button setPetName; // declare the pet name button
	
	@FXML
	Button feedThePet; // declare the feed pet button
	
	@FXML
	Button playWithPet; // declare the play with pet button
	
	@FXML
	Button letPetSleep; // declare the let pet sleep button
	
	@FXML
	ImageView petImage; // declare the pet's image
	
	@FXML
	TextField petNameTextField; // declare the pet name text field
	
	@FXML
	RadioButton birmanRadioButton; // declare the Birman radio button

	@FXML
	RadioButton britishRadioButton; // declare the British Shorthair radio button

	@FXML
	RadioButton exoticRadioButton; // declare the Exotic Shorthair radio button

	@FXML
	RadioButton norwegianRadioButton; // declare the Norwegian forest cat radio button
	
	@FXML
	Label promptString;
	
	@FXML
	Label petNameString;
	
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
	
	@FXML
	Label pleaseEnterANameString;
	
	// initializes the scene
	public void start(Stage primaryStage) throws IOException{
		this.primaryStage = primaryStage;
			
		/* load the FXML */
		FXMLLoader loaderMainMenu = new FXMLLoader(getClass().getResource("/Main.fxml")); //
		loaderMainMenu.setController(this);
		Parent root = loaderMainMenu.load();
			
		Scene scene = new Scene(root, 640, 480); // create the scene
		mainScene = scene;
		primaryStage.setScene(scene); // set the Scene
		primaryStage.setTitle("Main Menu"); // name the scene
			
		primaryStage.show(); // show the scene
		
		petImage.setImage(new Image(PetController.showPetImage()));
		updateStats();

	}
	
	
	// actions taken upon Birman radio button press
	@FXML
	protected void handleBirmanRadioButton(ActionEvent event) throws IOException{
		PetController.changePetImage("birman");
		petImage.setImage(new Image(PetController.showPetImage()));
	}
	
	// actions taken upon British radio button press
	@FXML
	protected void handleBritishRadioButton(ActionEvent event) throws IOException{
		PetController.changePetImage("british");
		petImage.setImage(new Image(PetController.showPetImage()));
	}
	
	// actions taken upon Exotic radio button press
	@FXML
	protected void handleExoticRadioButton(ActionEvent event) throws IOException{
		PetController.changePetImage("exotic");
		petImage.setImage(new Image(PetController.showPetImage()));
	}
	
	// actions taken upon Norwegian radio button press
	@FXML
	protected void handleNorwegianRadioButton(ActionEvent event) throws IOException{
		PetController.changePetImage("norwegian");
		petImage.setImage(new Image(PetController.showPetImage()));
	}
	
	
	// update the stats Strings
	protected void updateStats(){
		Map <String, Integer> stats = PetController.getStats();
		healthString.setText(stats.get("HP") + " / " + stats.get("maxHP"));
		energyString.setText(stats.get("energy") + " / " + stats.get("maxEnergy"));
		happinessString.setText(stats.get("happiness") + " / 100");
		hungerString.setText(stats.get("hunger") + " / 100");
		hygieneString.setText(stats.get("hygiene") + " / 100");
		coinsString.setText("" + stats.get("coins"));

	}
	
		
	// actions taken upon Set Pet Name button press
	@FXML
	protected void handleSetPetNameButton(ActionEvent event) throws IOException{
		String input = petNameTextField.getText(); // get the input from the pet name textfield
		
		if (input.equals("")) {
			pleaseEnterANameString.setVisible(true);
			return;
		}
		
		pleaseEnterANameString.setVisible(false);
		setPetName.setVisible(false);
		petNameTextField.setVisible(false);
		promptString.setVisible(false);
		petNameString.setText(input);
		birmanRadioButton.setVisible(false);
		britishRadioButton.setVisible(false);
		exoticRadioButton.setVisible(false);
		norwegianRadioButton.setVisible(false);
	}
	
	// actions taken upon Feed Pet button press
	@FXML
	protected void handleFeedThePetButton(ActionEvent event) throws IOException{
		
		Map <String, Integer> stats = PetController.getStats();
		
		if (stats.get("coins") > 0) {
			Pet.pet1.setCoins(stats.get("coins") - 1);
			Pet.pet1.setEnergy(stats.get("energy") - 1);
			if (stats.get("hunger") > 0) {
				Pet.pet1.setHunger(stats.get("hunger") - 1);
			}
			else {
				if (stats.get("happiness") > 0) {
					Pet.pet1.setHappiness(stats.get("happiness") - 1);
				}
			}
			updateStats();
		}
		
	}
	
	
	// actions taken upon Play with Pet button press
	@FXML
	protected void handlePlayWithPetButton(ActionEvent event) throws IOException{
		
		Map <String, Integer> stats = PetController.getStats();
		
		if (stats.get("energy") > 0) {
			Pet.pet1.setEnergy(stats.get("energy") - 1);
			Pet.pet1.setHappiness(stats.get("happiness") + 1);
			updateStats();
		}
	}
	
	
	// actions taken upon Let Pet Sleep button press
	@FXML
	protected void handleLetPetSleepButton(ActionEvent event) throws IOException{
		
		Map <String, Integer> stats = PetController.getStats();
		
		if (stats.get("energy") < 100) {
			Pet.pet1.setEnergy(stats.get("energy") + 1);
			updateStats();
		}
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
		loaderMainMenu.setController(new Game(primaryStage, mainScene));
		Parent root = loaderMainMenu.load();
			
		Scene gameScene = new Scene(root, 640, 480);
		
		//change scene from main scene to game scene.
		primaryStage.setTitle("GameBro: Flappy Birb");
		primaryStage.setScene(gameScene);;
	}
	
	public static void main (String [] args) throws Exception {
		
		PetController.handle();
		
		launch(args); // launch the app
		
		
	}

}