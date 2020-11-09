package testcimpa.org;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import cimpa.org.Orange;


public class OrangeTest {
	private Orange o1, o2,o3; 
	
	@Before
	public final void before() {
	
		 o1 = new Orange(0.5,"France");
		 o2 = new Orange(0.5,"Espagne");
		 o3= new Orange(0.5,"France");
	}

	@Test
	public void testequalorange() {
		
		assertEquals(o1,o3);
		assertNotEquals(o1,o2);
	}

}
