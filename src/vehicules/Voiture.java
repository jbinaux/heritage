package vehicules;


/**
 * 
 */
public class Voiture extends Vehicule {

    /**
     * Default constructor
     */
    public Voiture() {
    }

    /**
     * 
     */
    public int nbreRoues;

    /**
     * 
     */
    public int nbrePortes;

    /**
     * 
     */
    public int capaciteCoffre;

    /**
     * 
     */
    public String marquePneu;

    /**
     * 
     */
    public boolean boiteAuto;

    /**
     * @return
     */
    public String klaxonne() {
        // TODO implement here
        return "tuut tuut";
    }

	public int getNbreRoues() {
		return nbreRoues;
	}

	public void setNbreRoues(int nbreRoues) {
		this.nbreRoues = nbreRoues;
	}

	public int getNbrePortes() {
		return nbrePortes;
	}

	public void setNbrePortes(int nbrePortes) {
		this.nbrePortes = nbrePortes;
	}

	public int getCapaciteCoffre() {
		return capaciteCoffre;
	}

	public void setCapaciteCoffre(int capaciteCoffre) {
		this.capaciteCoffre = capaciteCoffre;
	}

	public String getMarquePneu() {
		return marquePneu;
	}

	public void setMarquePneu(String marquePneu) {
		this.marquePneu = marquePneu;
	}

	public boolean isBoiteAuto() {
		return boiteAuto;
	}

	public void setBoiteAuto(boolean boiteAuto) {
		this.boiteAuto = boiteAuto;
	}

}