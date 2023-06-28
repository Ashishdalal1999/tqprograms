package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void calculatortest1()
	{
		Calc c=new Calc();
		assertEquals(15, c.add(10,5));
		assertEquals(5, c.sub(10,5));
		assertEquals(50, c.mul(10,5));
		assertEquals(2, c.div(10,5));		
	}

}
