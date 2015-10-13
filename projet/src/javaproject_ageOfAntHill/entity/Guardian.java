package javaproject_ageOfAntHill.entity;

/**
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */

public class Guardian extends Unit {

	private final static int DEFAULT_GUARDIAN_SPEED = 2;
	private static final int DEFAULT_HEAVY_UNIT_ARMOR = 0;
	private static final int DEFAULT_HEAVY_UNIT_DAMAGE = 0;
	private static final int DEFAULT_HEAVY_UNIT_HP = 0;
	private final static String GUARDIAN_TYPE = "GUARD";

	/**
	 * That creates a guardian with its default stats.
	 */
	public Guardian(int teamNumber) {
		this.setRange(DEFAULT_UNIT_RANGE);
		this.setArmor(DEFAULT_HEAVY_UNIT_ARMOR);
		this.setDamages(DEFAULT_HEAVY_UNIT_DAMAGE);
		this.setMaxHealthPoints(DEFAULT_HEAVY_UNIT_HP);
		this.setHealthPoints(DEFAULT_HEAVY_UNIT_HP);
		this.setDeplacements(DEFAULT_GUARDIAN_SPEED);
		this.setTeam(teamNumber);
		this.setType(GUARDIAN_TYPE);
	}

	/**
	 * The guardian's armor is momentarily strenghened.
	 */
	public void resister() { // si le 'momentanement' (le temps) est trop dur a
								// gerer, trouver autre chose
	}

}
