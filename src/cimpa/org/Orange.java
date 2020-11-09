package cimpa.org;

public class Orange {

	public double prix;
	public String origine;
	
	public Orange() {
		
		super();
	}

	
	
	
	public Orange(double prix, String origine) {
		
		setPrix(prix);
		this.origine = origine;
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		if(prix<0) {
			
			throw new RuntimeException("le prix n'est pas etre negatif");	
		}
		
		else
			this.prix = prix;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}
	
	@Override
	public String toString() {
		
		return "Orange--> prix= " + prix + " pays= " + origine; 
	}
	
	@Override
	public boolean equals(Object obj) {
		Orange o = (Orange)obj;
		if(o.getOrigine() == this.getOrigine() && o.getPrix()==this.getPrix()) {
			return true;}
		else return false;
		}

}
