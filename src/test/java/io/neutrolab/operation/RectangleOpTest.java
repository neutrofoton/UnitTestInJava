package io.neutrolab.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleOpTest {
	
	GeometryOp2D op;
	
	@BeforeEach
	void beforeEachIsnit() {
		/*@BeforeEach is used to signal that the annotated method should be executed 
		 * before each @Test, @RepeatedTest, @ParameterizedTest, @TestFactory, and @TestTemplate method 
		 * in the current test class
		*/
		op = new RectangleOp(2, 1);
	}
	
	@AfterEach
	void cleanUpEach() {
		System.out.println("clean up each");
	}
	
	@Test
	void testCalculateArea() {
		double expected = 2;
		double actual = op.calculateArea();
		
		assertEquals(expected, actual);
	}

	@Test
	void testCalculatePerimeterOrCircumference() {
		double expected = 6;
		double actual = op.calculatePerimeterOrCircumference();
		
		assertEquals(expected, actual);
	}

}
