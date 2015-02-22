package com.pest.testsuit;

import com.pest.mutant.test.Algorithm3Test;
import com.pest.mutant.utility.Utility3Test;
//import com.pest.mutant.test.Algorithm4Test;
//import com.pest.mutant.utility.Utility4Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class All3Tests extends TestCase {

	public static Test suite() {
		TestSuite suite = new TestSuite(All3Tests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(Algorithm3Test.class);
		suite.addTestSuite(Utility3Test.class);
		//suite.addTestSuite(AlgorithmTest4.class);
		//suite.addTestSuite(UtilityTest4.class);
		//$JUnit-END$
		return suite;
	}

}
