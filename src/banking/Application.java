package banking;

public class Application {

	public static void main(String[] args) {

		Person pierre = new Person(200);
		Person aurelia = new Person(100);
		pierre.setName("Pierre");
		pierre.getPel().setSolde(2000);
		aurelia.setName("Aurelia");
		aurelia.getPel().setSolde(1000);
		System.out.println("Pierre = " + pierre.getCourant().getSolde() + " euros");
		System.out.println("Aurelia = " + aurelia.getCourant().getSolde() + " euros");
		aurelia.getCourant().virement(25, pierre.getCourant());
		System.out.println("Pierre = " + pierre.getCourant().getProprietaire().getCourant().getSolde() + " euros");
		System.out.println("Aurelia = " + aurelia.getCourant().getSolde() + " euros");
		
	}

}
