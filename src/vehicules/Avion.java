package vehicules;


/**
 * 
 */
public class Avion extends Vehicule {

    /**
     * Default constructor
     */
    public Avion() {
    }

    /**
     * 
     */
    public int nbreMoteur;

    /**
     * 
     */
    public String typeAvion;

    /**
     * 
     */
    public boolean piloteAuto;

    /**
     * 
     */
    public boolean enVol;

    /**
     * @return
     */
    public void lancerPiloteAuto() {
        // TODO implement here
    }

    /**
     * @return
     */
    public void decoller() {
        enVol = true;
    }

    /**
     * @return
     */
    public void atterir() {

    	enVol = false;
    }

	public int getNbreMoteur() {
		return nbreMoteur;
	}

	public void setNbreMoteur(int nbreMoteur) {
		this.nbreMoteur = nbreMoteur;
	}

	public String getTypeAvion() {
		return typeAvion;
	}

	public void setTypeAvion(String typeAvion) {
		this.typeAvion = typeAvion;
	}

	public boolean isPiloteAuto() {
		return piloteAuto;
	}

	public void setPiloteAuto(boolean piloteAuto) {
		this.piloteAuto = piloteAuto;
	}

	public boolean isEnVol() {
		return enVol;
	}

	public void setEnVol(boolean enVol) {
		this.enVol = enVol;
	}

    
}