package application.controller;

import java.util.*;
import application.model.Pet;

public class PetController {
	
	static Map <String, String> petImages = new HashMap <String, String>();
	
	public static void handle() {
		Pet.pet1 = new Pet("Furby", 3);
		petImages.put("birman", "./birman.png");
		petImages.put("british", "./british-shorthair.png");
		petImages.put("exotic", "./exotic-shorthair.png");
		petImages.put("norwegian", "./norwegian-forest-cat.png");
	}
	
	public static String showPetImage() {
		return petImages.get(Pet.pet1.getPetImage());
	}
	
	public static void changePetImage(String petImage) {
		Pet.pet1.setPetImage(petImage);
	}
	
	public static Map <String, Integer> getStats() {
		Map <String, Integer> stats = new HashMap <String, Integer>();
		stats.put("HP", Pet.pet1.getHP());
		stats.put("maxHP", Pet.pet1.getMaxHP());
		stats.put("energy", Pet.pet1.getEnergy());
		stats.put("maxEnergy", Pet.pet1.getMaxEnergy());
		stats.put("happiness", Pet.pet1.getHappiness());
		stats.put("hunger", Pet.pet1.getHunger());
		stats.put("hygiene", Pet.pet1.getHygiene());
		stats.put("coins", Pet.pet1.getCoins());
		
		
		return stats;
	}
	
	
}
