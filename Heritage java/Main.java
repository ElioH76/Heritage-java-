
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Voiture V;
		Moto M;
		
		V = new Voiture ("Voiture","Mercedes","50 000€","A45 AMG","GF-456-FI");
		M = new Moto ("2 roues","Kawasaki","12 000€","Ninja 650","FJ-785-LM");
		
		System.out.print("Description de la voiture : " + "\n");
		V.Affiche();
		
		System.out.print("Description de la moto : " + "\n");
		M.Affiche();
	}

}
