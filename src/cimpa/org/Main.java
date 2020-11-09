package cimpa.org;

import java.util.ArrayList;

public class Main {

	private static Orange o1, o3,o2, o4,o5;
	private static ArrayList<Orange> panier1;
	private static panier panier2;
	
	public static void main(String[] args) {

		o1 = new Orange(0.5,"France");
		o2 = new Orange(1.5,"Espagne");
		o3 = new Orange(0.9,"France");
		o4 = new Orange(1.2,"Florida");
		o5 = new Orange(1.1,"Portugal");
		panier1=new ArrayList<Orange>();
		panier2= new panier(panier1,10);
		panier2.ajoute(o1);
		panier2.ajoute(o2);
		panier2.ajoute(o3);
		panier2.ajoute(o4);
		panier2.ajoute(o5);
		System.out.println(panier2.toString());
		
		panier2.boycotteOrigine("Portugal");
		System.out.println(panier2.toString());
		
		System.out.println(panier2.estPlein());
		System.out.println(panier2.estVide());
		panier2.retire();
		System.out.println(panier2);
		System.out.println(panier2.getPrix());
		
		

	}

}
