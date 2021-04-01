package io.neutrolab.operation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;

class BasicMathOpTest {

	@Test
	void testAdd() {
		BasicMathOp op = new BasicMathOp();
		
		int expected = 7;
		int actual = op.add(5, 2);
		
		assertEquals(expected, actual,"The add should add two numbers");
	}

	@Nested
	@DisplayName("Addition Test Collection")
	class AdditionTest{
		
		@Test
		@DisplayName("add postive numbers")
		void addPositive() {
			
			BasicMathOp op = new BasicMathOp();
			
			int expected = 2;
			int actual = op.add(1, 1);
			
			assertEquals(expected, actual);
		}
		
		@Test
		@DisplayName("add negative numbers")
		void addNegative() {
			
			BasicMathOp op = new BasicMathOp();
			
			int expected = -2;
			int actual = op.add(-1, -1);
			
			assertEquals(expected, actual);
		}
	}
	
	@Test
	@DisplayName("test addition multi scenario")
	void testAddMultiScenario() {
		BasicMathOp op = new BasicMathOp();
		
		assertAll(
				() -> assertEquals(1, op.add(1, 0)),
				() -> assertEquals(1, op.add(0, 1)),
				() -> assertEquals(-1, op.add(-1, 0)),
				() -> assertEquals(-1, op.add(0, -1))
		);
	}
	
	@Test
	void testSubtract() {
		BasicMathOp op = new BasicMathOp();
		
		int expected = 3;
		int actual = op.subtract(5, 2);
		
		assertEquals(expected, actual,"The add should subtract two numbers");
	}

	@Test
	void test_divide_by_zero_should_throw_exception() {
		BasicMathOp op = new BasicMathOp();
		
		assertThrows(ArithmeticException.class, () -> op.divide(7, 0));
	}
	

	@RepeatedTest(3)
	void test_that_is_repeated(RepetitionInfo ri) {
		
		//ri.getCurrentRepetition();
		
		BasicMathOp op = new BasicMathOp();
		
		int expected = 2;
		int actual = op.add(1, 1);
		
		assertEquals(expected, actual);
	}
}
