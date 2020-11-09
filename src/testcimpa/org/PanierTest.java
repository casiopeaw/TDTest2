package testcimpa.org;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import cimpa.org.panier;
import cimpa.org.Orange;

public class PanierTest {
	private panier p1,p2,p3;
	ArrayList<Orange> l1,l2,l3;
	@Before
	public final void before() {
		l1= new ArrayList<Orange>();
		l2= new ArrayList<Orange>();
		l3= new ArrayList<Orange>();

		 p1 = new panier(l1,20);
		 p2 = new panier(l2,20);
		 p3 = new panier(l3,20);

	}

	@Test
	public void testequalpanier() {
		
		p1.ajoute(new Orange(0.80,"France"));
		p1.ajoute(new Orange(1.50,"Portugal"));
		p1.ajoute(new Orange(0.68,"France"));
		p1.ajoute(new Orange(2.00,"Florida"));
		p1.ajoute(new Orange(1.50,"Florida"));
		p1.ajoute(new Orange(1.50,"Espagne"));
		
		p2.ajoute(new Orange(0.80,"France"));
		p2.ajoute(new Orange(1.50,"Portugal"));
		p2.ajoute(new Orange(0.68,"France"));
		p2.ajoute(new Orange(2.00,"Florida"));
		p2.ajoute(new Orange(1.50,"Florida"));
		p2.ajoute(new Orange(1.50,"Espagne"));
		
		p3.ajoute(new Orange(0.80,"France"));
		p3.ajoute(new Orange(1.50,"Portugal"));
		p3.ajoute(new Orange(0.68,"France"));
		p3.ajoute(new Orange(2.00,"Florida"));
		p3.ajoute(new Orange(1.50,"Florida"));
		
		assertEquals(p1,p2);
		assertNotEquals(p1,p3);
	}

}
