import lesschtroumpfs.*;

public class MainVillage {

	public static void main (String[] argv) {
		String[] nomsSchtroumpfs = {
		        "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur lunettes",
		        "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf etonne", "Schtroumpf acrobate", "Schtroumpf paresseux"
		};
		
		Village test = new Village("Village1",100, nomsSchtroumpfs);
		
		test.solstice_d_ete();
		
		System.out.println("Le chef du village est : " + test.chefDuVillage().getNom() +" , il va se presenter :");
		test.chefDuVillage().sePresenter();
		
		test.envoyerAuTravail();
		
		test.schtroumpsHeureux();
		
		test.recolterEnsembleV2();
		test.solstice_d_ete();
		test.dinerEnsemble();
		test.solstice_d_ete();
		test.recolterEnsembleV2();
		test.solstice_d_ete();
		test.recolterEnsembleV2();
		test.solstice_d_ete();
	
	}
}
