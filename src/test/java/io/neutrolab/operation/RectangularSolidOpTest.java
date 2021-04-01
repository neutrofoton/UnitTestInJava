package io.neutrolab.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS) //default:Lifecycle.PER_METHOD
class RectangularSolidOpTest {

	private static GeometryOp3D op;
	
	@BeforeAll
	static void initBeforeAll() {
		op = new RectangularSolidOp(3,2,1);
	}
	
	@Test
	void testCalculateSurfaceArea() {
		
		double expected = 2*(
				3*2 + 
				1*2 +
				1*3
			);
		double actual = op.calculateSurfaceArea();
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculateVolume() {
		
		double expected = 6;
		double actual = op.calculateVolume();
		
		assertEquals(expected, actual);
	}
	
	@Test
	@EnabledOnOs(value = OS.LINUX)
	void test_should_be_on_applicable_on_linux_only() {
		assertTrue(true);
	}

}
