package application.model;

public class Pet {

	public static Pet pet1;
	private String name;
	private int age; // Age in years only, never changes
	private int maxHP = 100;
	private int HP = 100;
	private int coins = 20;
	private int maxEnergy = 100;
	private int energy = 80;
	private int maxHappiness = 100;
	private int happiness = 50;
	private int hygiene = 90;
	private int hunger = 10;
	private String petImage = "birman";
	
	public Pet (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getMaxHP() {
		return this.maxHP;
	}
	
	public int getHP() {
		return this.HP;
	}
	
	public int getCoins() {
		return this.coins;
	}
	
	public int getMaxEnergy() {
		return maxEnergy;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int getMaxHappiness() {
		return maxHappiness;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
	public int getHygiene() {
		return this.hygiene;
	}
	
	public int getHunger() {
		return this.hunger;
	}
	
	public String getPetImage() {
		return this.petImage;
	}
	
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	
	public void setHP(int HP) {
		this.HP = HP;
	}
	
	public void setCoins(int coins) {
		this.coins = coins;
	}
	
	public void setMaxEnergy(int maxEnergy) {
		this.maxEnergy = maxEnergy;
	}
	
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	public void setMaxHappiness(int maxHappiness) {
		this.maxHappiness = maxHappiness;
	}
	
	public void setHappiness(int happiness) {
		this.happiness = happiness;
	}
	
	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}
	
	public void setHunger(int hunger) {
		this.hunger = hunger;
	}
	
	public void setPetImage(String petImage) {
		this.petImage = petImage;
	}

}
