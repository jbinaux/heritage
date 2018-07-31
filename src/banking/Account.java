package banking;


/**
 * 
 */
public class Account {

    /**
     * Default constructor
     */
    public Account() {
    }

    /**
     * 
     */
    private  double solde;

    /**
     * 
     */
     private String id;

    /**
     * 
     */
    private Person proprietaire;

    /**
     * 
     */
    double taux;

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Person proprietaire) {
		this.proprietaire = proprietaire;
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

    
}