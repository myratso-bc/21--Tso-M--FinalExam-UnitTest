package unitTestFinal;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;


public class StringCalculatorTest {
	public static StringCalculator c;
	@Test
	public void testNegativeNumbers() { 
	    assertThrows(IllegalArgumentException.class, () -> {
	       StringCalculator.add("-1,5");
	    });
	}
		
	@Test
	public void testOver1000() { 
	   int actual = StringCalculator.add("1,1000");
	   int expected = 1;
	   assertEquals(actual, expected);
	}
}
