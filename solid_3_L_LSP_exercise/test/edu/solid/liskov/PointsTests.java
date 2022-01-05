package edu.solid.liskov;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PointsTests {

	private final Point3D reference = new Point3D(3,5 ,0);
	private final List<Point3D> test_points = Arrays.asList(
			                                         new Point3D(2,3, 0),
			                                         new Point3D(3,5, 0),
			                                         new Point3D(4,3, 0)
			                                         );
	
	
	@Test
	public void test_equal_if_only_if_dinstance_0() {
			Point3D point = new Point3D(3,5, 1);
			Assert.assertEquals("test for " + reference + " and " + point,
					             true,
					             reference.distance(point) == 0);
	}

}
