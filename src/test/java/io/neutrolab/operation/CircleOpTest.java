package io.neutrolab.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CircleOpTest {

	static GeometryOp2D op;
	
	@BeforeAll
	static void beforeAllInit() {
		/*
		 * @BeforeAll methods are only executed once for a given test class.
		 */
		
		op = new CircleOp(2);
	}
	
	@Test
	void testCalculateArea() {
		double expected = Math.PI*2*2;
		double actual = op.calculateArea();
		
		assertEquals(expected, actual);
		
	}

	@Test
	void testCalculatePerimeterOrCircumference() {
		double expected = 2 * Math.PI * 2;
		double actual = op.calculatePerimeterOrCircumference();
		
		assertEquals(expected, actual);
	}

}
