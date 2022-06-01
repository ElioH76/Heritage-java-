public class Vehicule {

	protected String type;
	protected String marque;
	protected String prix_vente;
	
	
	public Vehicule(String type, String marque, String prix_vente)
	{
		this.type = type;
		this.marque = marque;
		this.prix_vente = prix_vente;
	}
	
	public void Affiche()
	{
		System.out.println("Type de véhicule :  " + this.getType() + "\n" + "Marque du véhicule : " + this.getMarque() + "\n" + "Prix de vente : " + this.getprix_vente() + "\n");
	}
	
	public void setType(String Type)
	{
		this.type = Type;
	}
	public String getType()
	{
		return type;
	}
	
	public void setMarque(String Marque)
	{
		this.marque = Marque;
	}
	public String getMarque()
	{
		return marque;
	}
	
	public void setprix_vente(String prix_vente)
	{
		this.prix_vente = prix_vente;
	}
	public String getprix_vente()
	{
		return prix_vente;
	}
}
