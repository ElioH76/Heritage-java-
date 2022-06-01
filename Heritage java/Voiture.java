
public class Voiture extends Vehicule {
	
	 private String nom_vehicule;
     private String plaque;

     public Voiture(String type, String marque, String prix_vente, String nom_vehicule, String plaque)
     {
    	 super(type, marque, prix_vente);
         this.nom_vehicule = nom_vehicule;
         this.plaque = plaque;
     }

     public void Affiche()
     {
    	 super.Affiche();
    	 System.out.println("Modèle du véhicule : " + this.getNom_vehicule() + "\n" + "Plaque d'immatriculation du véhicule : " + this.getPlaque() + "\n");
     }

     public void setNom_Vehicule(String Nom_vehicule)
     {
         this.nom_vehicule = Nom_vehicule;
     }
     public String getNom_vehicule()
     {
         return nom_vehicule;
     }

     public void setPlaque(String Plaque)
     {
         this.plaque= Plaque;
     }
     public String getPlaque()
     {
         return plaque;
     }


}

