package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javaUtility.UtilityClass;

class UtilityCalssTesting {

	@Test
	void test() {
		   String removeZero = "00london";
		   
		   String output = UtilityClass.removeLeadingZero(removeZero);
		   assertEquals("london", output);
		   
			
		}
	}


