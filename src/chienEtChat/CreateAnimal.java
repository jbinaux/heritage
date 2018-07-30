package chienEtChat;

public class CreateAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Chien monChien = new Chien();
		Chat monChat = new Chat();
		monChien.setNom("Medor");
		monChien.setCouleur("Noir");
		monChat.setNom("Calin");
		monChat.setCouleur("Gris");
		System.out.println("Mon chien s'appelle " + monChien.getNom() + " et il fait " + monChien.aboie());
		System.out.println("Mon Chat s'appelle " + monChat.getNom() + " et il fait " + monChat.miaule());
	}

}
