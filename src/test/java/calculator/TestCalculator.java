package calculator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.AfterClass;  
import org.junit.Test;

public class TestCalculator {
	
	@BeforeClass
	public static void beforclass() throws Exception{
		System.out.println("Before Class");
		 Calculator cal= new Calculator();
	}

	@Test
	public void testfindMax() {
		Calculator cal=new Calculator();
		assertEquals(9,cal.findMax(7, 5, 9));
			}
	@Test
	public void test2findMax() {
		Calculator cal=new Calculator();
		assertEquals(9,cal.findMax(6, 5, 9));
			}
	@Test
	public void testsquare() {
		Calculator cal=new Calculator();
		assertEquals(49,cal.square(7));
	}
	
	@Test
	public void test2square() {
		Calculator cal=new Calculator();
		assertEquals(9,cal.square(3));
	}
	
	@AfterClass
	public static void AfterClass() throws Exception{
		System.out.println("After class");
	}
}
