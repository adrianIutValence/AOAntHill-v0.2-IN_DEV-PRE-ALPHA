package javaproject_ageOfAntHill.entity.buildable;

/**
 * represents a Building used when creating new building
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150906
 */
public abstract class Building extends Buildable {


	public static int healthPoints = 10;
	public static int maxHealthPoints = 10;
	
	protected int team;
	public static int armor = 3;

	/**
	 * creates a new building corresponding to a new in-game building...)
	 * 
	 * @param none
	 *            default builder
	 */
	public Building() {
		this.healthPoints = healthPoints;
		this.maxHealthPoints = maxHealthPoints;
		this.armor = armor;
	}

	/**
	 * builder with health of the building and his max health
	 * 
	 * @param health
	 * @param maxHealth
	 */
	public Building(int health, int maxHealth) {
		this.healthPoints = health;
		this.maxHealthPoints = maxHealth;
	}

	/**
	 * open the menu with the different available options for this entity
	 */
	public void openMenu() {

	}

}
