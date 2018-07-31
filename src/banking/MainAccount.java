package banking;

/**
 * 
 */
public class MainAccount extends Account {

    /**
     * Default constructor
     */
    public MainAccount() {
    	setTaux(0);
    }

    /**
     * @param somme 
     * @param destinataire 
     * @return
     */
    public void virement(int somme, MainAccount destinataire) {
        setSolde(getSolde() - somme);
        destinataire.setSolde(destinataire.getSolde() + somme);
    }

    /**
     * @param somme 
     * @return
     */
    public void retirerArgent(int somme) {
    	setSolde(getSolde() - somme);
    }

    /**
     * @param somme 
     * @return
     */
    public void AjouterAuPEL(int somme) {
    	setSolde(getSolde() - somme);
    	getProprietaire().getPel().setSolde(getProprietaire().getPel().getSolde() + somme);
    }

}