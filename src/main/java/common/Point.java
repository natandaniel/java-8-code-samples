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
}