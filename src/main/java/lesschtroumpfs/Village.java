package lesschtroumpfs;

import java.util.ArrayList;

public class Village {

	private String nom;
	private ArrayList<Schtroumpf> tab;
	private int nbS;
	private int stock;	

	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.nom = pfNomV;
		this.stock = pfStockSalsepareille;
		this.nbS = 0;
		this.tab = new ArrayList<>();
		
		for (int i=0; i<pfNomsDesSchtroumpfs.length; i++) {
			tab.add(new Schtroumpf (pfNomsDesSchtroumpfs[i],(int)(Math.random()*150), this));
			this.nbS++;
		}
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNbSchtroumpf() {
		return this.nbS;
	}
	
	public int getStockSalsepareille() {
		return this.stock;
	}
	
	public void solstice_d_ete() {
		int a = 0;
		System.out.println("Nom du valliage : " + this.nom + "\nNombre de Schtroumpfs presents : " + this.nbS);
		for (int i=0; i<this.nbS; i++) {
			this.tab.get(i).sePresenter();
			this.tab.get(i).chanter();
			if (this.tab.get(i).estContent()) {
				a++;
			}
		}
		System.out.println("Nombre de Schtroumpfs content : " + a );
	}
	
	public Schtroumpf chefDuVillage() {
		Schtroumpf chef = new Schtroumpf("A", 0);
		for (int i=0; i<this.nbS; i++) {
			if (this.tab.get(i).getAge() > chef.getAge()) {
				chef = this.tab.get(i);
			}
		}
		return chef;
	}
	
	public void envoyerAuTravail() {
		for (int i=1; i<this.nbS; i=i+2) {
			this.tab.get(i).allerTravailler();
		}
	}
	
	public void schtroumpsHeureux() {
		for (int i=0; i<this.nbS; i++) {
			if(this.tab.get(i).estContent()) {
				this.tab.get(i).sePresenter();
				this.tab.get(i).chanter();
			}
		}
	}
	
	public void recolterSalsepareille() {
		this.stock += 5;
	}
	
	public boolean dinerAuVillage() {
		if(this.stock > 2) {
			this.stock -= 3;
			return true;
		}
		return false;
	}
	
	public void recolterEnsemble() {
		for (int i=0; i<this.nbS; i++) {
			this.tab.get(i).recolter();
		}
	}
	
	public void recolterEnsembleV2() {
		int nbContent = 0;
		for (int i=0; i<this.nbS; i++) {
			if (this.tab.get(i).estContent()){
				nbContent++;
			}
		}
		nbContent/= 2;
		for (int i=0; i<this.nbS && nbContent > 0; i++) {
			if (this.tab.get(i).estContent()){
				this.tab.get(i).recolter();
				nbContent--;
			}
		}
	}
	
	public void dinerEnsemble() {
		for (int i=0; i<this.nbS; i++) {
			this.tab.get(i).diner();
		}
	}
}
