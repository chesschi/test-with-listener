package com.pest.mutant.test;

import junit.framework.TestCase;

public class Algorithm3Test extends TestCase {

	private final Algorithm algorithm = new Algorithm();
	
	public void testSumIntInt() {
		//assertEquals(2, algorithm.sum(1,1));
		//assertEquals(2, algorithm.sum(0,2));
		//assertEquals(2, algorithm.sum(-1,3));
		assertEquals(0, algorithm.sum(-1,-1));
	}

	public void testSumIntIntInt() {
		assertEquals(3, algorithm.sum(1,1,1));
		assertEquals(3, algorithm.sum(0,2,1));
		assertEquals(3, algorithm.sum(-1,3,1));
		assertEquals(-3, algorithm.sum(-1,-1,-1));
	}

	public void testSubtractIntInt() {
		assertEquals(3, algorithm.subtract(4, 1));
		assertEquals(-3, algorithm.subtract(1, 4));
		assertEquals(-3, algorithm.subtract(-1, 2));
		assertEquals(-3, algorithm.subtract(1, 4));
	}

	public void testSubtractIntIntInt() {
		assertEquals(3, algorithm.subtract(5, 1, 1));
		assertEquals(-3, algorithm.subtract(1, 3, 1));
		assertEquals(1, algorithm.subtract(-1, -1, -1));
		assertEquals(-3, algorithm.subtract(1, 3, 1));
	}

	public void testMultiplyIntInt() {
		assertEquals(2, algorithm.multiply(2, 1));
		assertEquals(-2, algorithm.multiply(2, -1));
		assertEquals(2, algorithm.multiply(-1, -2));
		assertEquals(0, algorithm.multiply(0, 100));
	}

	public void testMultiplyIntIntInt() {
		assertEquals(2, algorithm.multiply(2, 1, 1));
		assertEquals(-2, algorithm.multiply(2, -1, 1));
		assertEquals(2, algorithm.multiply(-1, -2, 1));
		assertEquals(0, algorithm.multiply(0, 100, 1));
	}

	public void testDivideIntInt() {
		assertEquals(0, algorithm.divide(1,2));
		assertEquals(1, algorithm.divide(2,2));
		assertEquals(1, algorithm.divide(3,2));			
	}

	public void testDivideIntIntInt() {
		assertEquals(0, algorithm.divide(1,2,1));
		assertEquals(1, algorithm.divide(4,2,2));
		assertEquals(1, algorithm.divide(4,2,2));		
	}

	public void testDivideIntIntException() {
		try {
			algorithm.divide(1,0);
			fail("expected exception");
		}
		catch(IllegalArgumentException e) {
			//! ok
		}
	}
	
	public void testDivideIntIntIntException() {
		try {
			algorithm.divide(1,1,0);
			fail("expected exception");
		}
		catch(IllegalArgumentException e) {
			//! ok
		}
	}
}