package cimpa.org;

import java.util.ArrayList;

public class panier {
	public ArrayList <Orange> panieroranges = new ArrayList<Orange>();
	public int tailleMAX;
	
	public panier() {
		super();
	}

	public panier(ArrayList<Orange> panieroranges, int tailleMAX) {
		super();
		this.panieroranges = panieroranges;
		this.tailleMAX = tailleMAX;
	}

	
	public boolean estPlein() {
		if (panieroranges.size() == tailleMAX) {
			return true;
			
		}
		else return false;
		
		
	}
	
	public boolean estVide() {
		if (panieroranges.size() ==0) {
			return true;
		}
		else return false;
	}
	
	
	
	public ArrayList<Orange> getPanieroranges() {
		return panieroranges;
	}

	public void setPanieroranges(ArrayList<Orange> panieroranges) {
		this.panieroranges = panieroranges;
	}

	public int getTaille() {
		return panieroranges.size();
	}

	public void setTaille_max(int taille_max) {
		this.tailleMAX = taille_max;
	}
	
	@Override
	public String toString() {
		return panieroranges.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		panier p1 = (panier)obj;
		if (p1.getTaille() == this.getTaille()) {
			
			
			/*
			 * une boucle avec deux codntions
			 * test si la taille est la même
			 * il faut tester que p1 contient tous les éléments de notre panier courant
			 * arraylist : on utilise la méthode contains : liste.contains(element) : true/false
			 */
			
			for (int i=0;i<p1.getTaille();i++) {
				if (!(p1.getPanieroranges().contains(this.getPanieroranges().get(i))))
					return false;
			}
			
			return true;
		}	
		else return false;
	}
	
	
	
	public void ajoute(Orange o) {
		
		if (panieroranges.size()<tailleMAX) {
			panieroranges.add(o);
		}
		else throw new RuntimeException("taille maximal attent");	
		
	}
	
	public void retire() {
		panieroranges.remove(panieroranges.size()-1);
	}
	
	public double getPrix() {
		double suma = 0;
		for(Orange i: panieroranges) {
			suma = suma + i.getPrix();
		}
		return suma;
	}
	/*if (list1.equals(l2)
	 * list1 = {x y z }
	 * l2 = { y x z }
	 * list1.equals(l2) ==> vérifier que list1(0) == l2(0) l1(1) == l2(1) ==> false alors que les paniers sont identiques
	 */
	
	public void boycotteOrigine(String origine) {
		for(int i=0;i<panieroranges.size();i++) {
			if (panieroranges.get(i).getOrigine()==origine) {
				panieroranges.remove(i);
			}
		}
	}
	
	
	
}
