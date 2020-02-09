package stream;

import java.util.Comparator;
import java.util.stream.IntStream;

import common.Point;

/**
 * In this code sample, I create 10 {@link Point}s starting with an {@link IntStream}
 * and then sort them in ascending order of their distance to origin point
 * O(0,0).
 * 
 * @author Natan
 *
 * @see Point
 */
public class StreamExample1 {

	public static void main(String[] args) {
		
		Point o = new Point(0.0,0.0);
				
		IntStream
		.range(1, 11)
		.mapToObj(i -> new Point(i%5d,i/4d))
		.sorted(Comparator.comparing(p -> p.distanceTo(o)))
		.forEach(p -> System.out.printf("%1.2f, %1.2f - distance to origin : %1.3f\n", p.getX(), p.getY(), p.distanceTo(o)));
	}
}
