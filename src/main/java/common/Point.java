package common;

/**
 * Represents a point in a 2-D space, characterized by its coordinates x and y.
 *
 */
public class Point {

	private Double x;
	private Double y;

	public Point(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	/**
	 * 
	 * Returns the distance between this point and another.
	 * 
	 * @param p a Point
	 * @return the distance between this point and p
	 */
	public double distanceTo(Point p) {

		double xSquared = (this.x - p.x) * (this.x - p.x);
		double ySquared = (this.y - p.y) * (this.y - p.y);

		return Math.sqrt(xSquared + ySquared);
	}
}