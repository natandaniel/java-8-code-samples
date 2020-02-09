package stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

import common.Point;

/**
 * In this code sample, I create 10 {@link Point}s and then determine the
 * maximum distance from these {@link Point}s to the origin {@link Point}
 * O(0,0).
 * 
 * @author Natan
 *
 * @see Point
 */
public class StreamExample2 {

	public static void main(String[] args) {

		Point o = new Point(0.0, 0.0);

		OptionalDouble maxDistance = IntStream.range(1, 11).mapToObj(i -> new Point(i % 5d, i / 4d))
				.mapToDouble(p -> p.distanceTo(o)).max();
		
		maxDistance.ifPresent(maxD -> System.out.printf("Maximum distance : %1.5f", maxD));
	}

}
