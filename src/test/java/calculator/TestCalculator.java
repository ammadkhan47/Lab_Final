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
		assertEquals(-5,cal.findMax(-7, -5, -9));
			}
	@Test
	public void test2findMax() {
		Calculator cal=new Calculator();
		assertEquals(9,cal.findMax(6, 5, 9));
			}

	@Test
	public void test3findMax() {
		Calculator cal=new Calculator();
		assertEquals(9,cal.findMax(-6, -5, 9));
			}
	
	@Test
	public void testsquare() {
		Calculator cal=new Calculator();
		assertEquals(49,cal.square(-7));
	}
	
	@Test
	public void test2square() {
		Calculator cal=new Calculator();
		assertEquals(9,cal.square(3));
	}
	
	@Test
	public void test3square() {
		Calculator cal=new Calculator();
		assertEquals(0,cal.square(0));
	}
	
	@Test
	public void testcube() {
		Calculator cal=new Calculator();
		assertEquals(0,cal.cube(0));
	}
	
	@Test
	public void test2cube() {
		Calculator cal=new Calculator();
		assertEquals(8,cal.cube(2));
	}
	
	@Test
	public void test3cube() {
		Calculator cal=new Calculator();
		assertEquals(-27,cal.cube(-3));
	}
	
	@AfterClass
	public static void AfterClass() throws Exception{
		System.out.println("After class");
	}
}
