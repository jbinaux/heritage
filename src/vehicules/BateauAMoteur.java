package vehicules;


/**
 * 
 */
public class BateauAMoteur extends Vehicule {

    /**
     * Default constructor
     */
    public BateauAMoteur() {
    }

    /**
     * 
     */
    public Boolean voile;

    /**
     * 
     */
    public String typeCoque;

    /**
     * 
     */
    public boolean amarre;

    /**
     * @return
     */
    public void amarrer() {
        // TODO implement here
    }

	public Boolean getVoile() {
		return voile;
	}

	public void setVoile(Boolean voile) {
		this.voile = voile;
	}

	public String getTypeCoque() {
		return typeCoque;
	}

	public void setTypeCoque(String typeCoque) {
		this.typeCoque = typeCoque;
	}

	public boolean isAmarre() {
		return amarre;
	}

	public void setAmarre(boolean amarre) {
		this.amarre = amarre;
	}
    

}