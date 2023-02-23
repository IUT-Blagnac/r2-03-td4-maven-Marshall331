package lesschtroumpfs;

public class Schtroumpf {
	
	private String nom;
	private int age;
	private boolean content;
	private Village village;

	public Schtroumpf(String pfNom, int pfAge){
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = null ;
	}
	
	public Schtroumpf(String pfNom, int pfAge, Village pfVillage){
		this.nom = pfNom;
		this.age = pfAge;
		this.content = true;
		this.village = pfVillage;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public Village getVillage() {
		return this.village;
	}
	
	public void setVillage(Village pfVillage) {
		this.village = pfVillage;
	}
	
	public boolean estContent() {
		return this.content;
	}
	
	public String toString() {
		if (this.content == true) {
			if(this.village == null) {
				return ("Je suis " + this.nom + " , j'ai " + this.age + " ans, je suis content et je suis ermite.");
			}
			else {
				return ("Je suis " + this.nom + " , j'ai " + this.age + " ans, je suis content et mon village est " + this.village.getNom());
			}
		}
		else {
			if(this.village == null) {
				return ("Je suis " + this.nom + " , j'ai " + this.age + " ans, je suis PAS content et je suis ermite.");
			}
			else {
				return ("Je suis " + this.nom + " , j'ai " + this.age + " ans, je suis PAS content et mon village est " + this.village.getNom());
			}
		}
	}
	
	public void sePresenter() {
		System.out.println(this.toString());
	}
	
	public String leChant() {
		if (this.content == true) {
			return( "la, la, la Schtroumpf la, la");
		}
		else {
			return ("gloups");
		}
	}
	
	public void chanter() {
		System.out.println(this.leChant());
	}
	
	public void anniversaire() {
		this.age++;
	}
	
	public void manger(int pfQte) {
		if (pfQte > 0) {
			this.content = true;
		}
	}
	
	public void allerTravailler() {
		this.content = false;
	}
	
	public void recolter() {
		this.content = false;
		if (this.village != null) {
			this.village.recolterSalsepareille();
		}
	}
	
	public void diner() {
		if (this.village != null) {
			if(this.village.dinerAuVillage()) {
				this.content = true;
			}
		}
		else {
			this.content = false;
		}
	}
}	