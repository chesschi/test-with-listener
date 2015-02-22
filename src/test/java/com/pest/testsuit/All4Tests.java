package com.pest.testsuit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.pest.mutant.test.Algorithm3Test;
import com.pest.mutant.test.Algorithm4Test;
import com.pest.mutant.utility.Utility3Test;
import com.pest.mutant.utility.Utility4Test;

@RunWith(Suite.class)
@SuiteClasses({ 
	//AlgorithmTest3.class,
	Algorithm4Test.class,
	//UtilityTest3.class,
	Utility4Test.class})

public class All4Tests {

}
