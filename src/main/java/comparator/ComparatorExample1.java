package comparator;

import java.util.Comparator;

/**
 * This code sample illustrates one of the {@link Comparator} interface's new
 * static factories, {@link Comparator#comparing(java.util.function.Function)
 * comparing}, enabling to easily create comparators provided a {@link Function}
 * defining a key extractor.
 * 
 * 
 * @author Natan
 *
 */
class ComparatorExample {

	public static void main(String[] args) {

		// A comparator that compares Points by their x coordinate.
		// We provide a Function that extracts the x coordinate of a Point.
		// A Comparator is returned comparing Points by their x coordinate.
		// Coordinates being Doubles, the natural ordering of Doubles is used to operate the comparisons.
		Comparator<Point> byX = Comparator.comparing(p -> p.getX());

		// This time a comparator that compares points by their y coordinate.
		Comparator<Point> byY = Comparator.comparing(p -> p.getY());

		// Lets test these comparators.

		Point p1 = new Point(1.0, 2.0);
		Point p2 = new Point(2.0, 1.0);

		boolean isTrueIfComparatorsOk = byX.compare(p1, p2) < 0 && byY.compare(p1, p2) > 0;

		System.out.println("Comparators work as expected (lambda version) : " + isTrueIfComparatorsOk);
		
		// Using method references makes the code even more concise.
		// Below are re-writes of the byX and byY comparators.
		byX = Comparator.comparing(Point::getX);
		byY = Comparator.comparing(Point::getY);
		
		isTrueIfComparatorsOk = byX.compare(p1, p2) < 0 && byY.compare(p1, p2) > 0;

		System.out.println("Comparators work as expected (method reference version) : " + isTrueIfComparatorsOk);
	}
	
	/**
	 * Represents a point in a 2-D space, characterized by its coordinates x and y.
	 *
	 */
	static class Point {

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
}