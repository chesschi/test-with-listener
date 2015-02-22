package com.pest.mutant.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Algorithm4Test {
	
	private final Algorithm algorithm = new Algorithm();

	@Test
	public void testSumIntInt() {
		//assertEquals(2, algorithm.sum(1,1));
		//assertEquals(2, algorithm.sum(0,2));
		//assertEquals(2, algorithm.sum(-1,3));
		assertEquals(0, algorithm.sum(-1,-1));
	}

	@Test
	public void testSumIntIntInt() {
		assertEquals(3, algorithm.sum(1,1,1));
		assertEquals(3, algorithm.sum(0,2,1));
		assertEquals(3, algorithm.sum(-1,3,1));
		assertEquals(-3, algorithm.sum(-1,-1,-1));
	}

	@Test
	public void testSubtractIntInt() {
		assertEquals(3, algorithm.subtract(4, 1));
		assertEquals(-3, algorithm.subtract(1, 4));
		assertEquals(-3, algorithm.subtract(-1, 2));
		assertEquals(-3, algorithm.subtract(1, 4));
	}

	@Test
	public void testSubtractIntIntInt() {
		assertEquals(3, algorithm.subtract(5, 1, 1));
		assertEquals(-3, algorithm.subtract(1, 3, 1));
                // wing: this test will fail
		assertEquals(0, algorithm.subtract(-1, -1, -1));
		assertEquals(-3, algorithm.subtract(1, 3, 1));
	}

	@Test
	public void testMultiplyIntInt() {
		assertEquals(2, algorithm.multiply(2, 1));
		assertEquals(-2, algorithm.multiply(2, -1));
		assertEquals(2, algorithm.multiply(-1, -2));
		assertEquals(0, algorithm.multiply(0, 100));
	}

	@Test
	public void testMultiplyIntIntInt() {
		assertEquals(2, algorithm.multiply(2, 1, 1));
		assertEquals(-2, algorithm.multiply(2, -1, 1));
		assertEquals(2, algorithm.multiply(-1, -2, 1));
		assertEquals(0, algorithm.multiply(0, 100, 1));
	}

	@Test
	public void testDivideIntInt() {
		assertEquals(0, algorithm.divide(1,2));
		assertEquals(1, algorithm.divide(2,2));
		assertEquals(1, algorithm.divide(3,2));
	}

	@Test
	public void testDivideIntIntInt() {
		assertEquals(0, algorithm.divide(1,2,1));
		assertEquals(1, algorithm.divide(4,2,2));
		assertEquals(1, algorithm.divide(4,2,2));
	}

	@Test(expected=IllegalArgumentException.class)
	public void testDivideIntIntException() {		
		algorithm.divide(1,0);		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testDivideIntIntIntException() {		
		algorithm.divide(1,1,0);		
	}
}
