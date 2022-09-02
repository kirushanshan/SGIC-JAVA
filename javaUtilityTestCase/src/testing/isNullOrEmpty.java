package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javaUtility.UtilityClass;

class isNullOrEmpty {

	@Test
	void test() {
		String nullText = null;
		
		boolean output = UtilityClass.isNullOrEmpty(nullText);
		assertEquals(false, output);
		
	}
	
	@Test
	void test2() {
		String nullText = "";
		boolean output = UtilityClass.isNullOrEmpty(nullText);
		assertEquals(false, output);
	}
	
	@Test
	void test3() {
		String nullText = "";
		boolean output = UtilityClass.isNullOrEmpty(nullText);
		assertEquals(true, output);
	}


}
