package labtestjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



//import com.calculator.calculator;

public class AddMulTest {
	//private static AddMul am;
	//private static AddMul AddMul;
	AddMul am=new AddMul();
	
	public static  void beforeAllTest() {
	
	 }
	@BeforeEach
	public void beforeeachTest(){
		
	}
	@Test
	public void testAdd()
	{
	   
		assertEquals(30,am.add(10,20));
	    
	}
	@Test
public void testmultiply()
	{
	    assertEquals(200,am.multiply(10,20));
	    
	}
	@ParameterizedTest
	@ValueSource(ints = {121,212})

	public void testpalindrome(int i)
	{
	    System.out.println("i= :" + i);
		assertTrue(am.ispalindrome(i));

	}
	
		@Test
		
		void arr() {
			assertEquals(3,am.isArrayList());
			
		}
		@Test
		void nnull() {
			 assertEquals(0, (am.isArrayList()));
		}

	@AfterEach
	public void AftereeachTest(){
		System.out.println("After each test");
		
	}
	@AfterAll
	public static void AfterAllTest() {
		System.out.println("Once After all test");
	 }
	}


