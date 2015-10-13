package javaproject_ageOfAntHill.map;

/**
 * represents a case at given (x,y) coordinates
 * 
 * @author Maxime Augst, Joris Chalumeau, Nicolas Logut, Mathieu Berthet, Adrian
 *         Amaglio, Adrien Arsac
 *
 * @version 20150526
 */
public class Position {
	
	private int abscissa;
	private int ordered;

	public int getX() {
		return abscissa;
	}

	public int getY() {
		return ordered;
	}

	public Position(int positionX, int positionY) {
		this.abscissa = positionX;
		this.ordered = positionY;
	}

	public boolean moveAvailable(int positionX, int positionY) {
		return true;
	}

}
