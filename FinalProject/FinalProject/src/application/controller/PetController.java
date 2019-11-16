package application.controller;

import java.util.*;
import application.model.Pet;

public class PetController {
	
	public static void handle() {
		Pet.pet1 = new Pet("Furby", 3);
	}
	
	public Map <String, Integer> getStats() {
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
