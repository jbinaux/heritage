
package banking;

import java.util.Date;

/**
 * 
 */
public class Person {

    /**
     * Default constructor
     */
    public Person(int solde) {
    	getCourant().setProprietaire(this);
    	getPel().setProprietaire(this);
    	getCourant().setSolde(solde);
    }

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String address;

    /**
     * 
     */
    private Date dateNaissance;

    /**
     * 
     */
    private MainAccount courant = new MainAccount();

    /**
     * 
     */
    private PEL pel = new PEL();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public MainAccount getCourant() {
		return courant;
	}

	public void setCourant(MainAccount courant) {
		this.courant = courant;
	}

	public PEL getPel() {
		return pel;
	}

	public void setPel(PEL pel) {
		this.pel = pel;
	}
    
    

}