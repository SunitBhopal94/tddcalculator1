package tddcalculator1;

import static org.junit.Assert.*;
import org.junit.Test;

import tddcalculator.tddcalculator;

public class testcal {

	@Test
	 
	public void whentddcalculatorInitializedThenReturnTrue()
	{
		tddcalculator cal= new tddcalculator();
		assertTrue(cal.getStatus());
	}
	
	@Test
	 
	public void whenAdditionTwoNumberThenReturnCorrectAnswer()
	{
		tddcalculator cal= new tddcalculator();
		assertEquals("error in add()",  3, cal.addition(1, 2));
		assertEquals("error in add()",  6, cal.addition(4, 2));
		assertEquals("error in add()", -4, cal.addition(-2, -2));
	}
	
	@Test
	public void testAdditionFail() 
	{
		 tddcalculator cal= new tddcalculator();
	      assertNotEquals("error in add()", 0, cal.addition(1, 2));
	} 
	
	@Test
	 
	public void whenSubtractionTwoNumberThenReturnCorrectAnswer()
	{
		tddcalculator cal= new tddcalculator();
		assertEquals("error in sub()",5, cal.subtraction(10,5));
		assertEquals("error in sub()",-1, cal.subtraction(-5,-4));
		assertEquals("error in sub()",0, cal.subtraction(3,3));
		
		
	}
	@Test
	public void testSubtractionFail() 
	{
		 tddcalculator cal= new tddcalculator();
	      assertNotEquals("error in sub()", 0, cal.subtraction(4, 2));
	} 
	
	
	
	@Test
	 public void whenMultiplyTwoNumberThenReturnCorrectAnswer()
	{
		tddcalculator cal= new tddcalculator();
		assertEquals("error in multiply()",45,cal.multiplication(9,5));
		assertEquals("error in multiply()",-30,cal.multiplication(-6,5));
		assertEquals("error in multiply()",0,cal.multiplication(9,0));
		
	}
	
	
	@Test
	public void testmultiplicationFail() 
	{
		 tddcalculator cal= new tddcalculator();
	      assertNotEquals("error in multiply()", 0, cal.multiplication(4, 2));
	} 
	
	
	  @Test
	    public void whenDivisionThenReturnCorrectAnswer() {
		  tddcalculator cal= new tddcalculator();
		  assertEquals("error in divide()",2,cal.division(10,5));
		  assertEquals("error in divide()",-4,cal.division(-12,3));
		  assertEquals("error in divide()",0,cal.division(0,2));
	    }
	  
	  @Test
	  public void testdivisionFail()
	  {
	  tddcalculator cal= new tddcalculator();
	  assertNotEquals("error in divide()", 1,cal.division(9, 3));
	  }
	  																				
	  @Test
	    public void whenModulusThenReturnRemainder() {
		  tddcalculator cal= new tddcalculator();
		  assertEquals(2,cal.mod(11,4));
		  

}
}

