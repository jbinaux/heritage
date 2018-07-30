package banking;

/**
 * 
 */
public class MainAccount extends Account {

    /**
     * Default constructor
     */
    public MainAccount() {
    	taux = 0;
    }

    /**
     * @param somme 
     * @param destinataire 
     * @return
     */
    public void virement(int somme, MainAccount destinataire) {
        this.solde -= somme;
        destinataire.setSolde(destinataire.getSolde() + somme);
    }

    /**
     * @param somme 
     * @return
     */
    public void retirerArgent(int somme) {
    	solde -= somme;
    }

    /**
     * @param somme 
     * @return
     */
    public void AjouterAuPEL(int somme) {
    	solde -= somme;
    	proprietaire.getPel().setSolde(proprietaire.getPel().getSolde() + somme);
    }

}