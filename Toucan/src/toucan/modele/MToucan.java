package toucan.modele;

public class MToucan {
	private LesCases lesCases;
	
	public MToucan(int nbCases){
		this.lesCases = new LesCases(nbCases);
	}
	
	public void creerLesMouvements(){
		lesCases.droite(0, 5);
		lesCases.droite(0, 10);
		lesCases.droite(0, 8);
		lesCases.droite(0, 6);
		lesCases.droite(1, 2);
		lesCases.droite(1, 7);
		lesCases.droite(1, 10);
	}
	
	public void ajouterCase(Case c){
		this.lesCases.ajouter(c);
	}
	
	public String toString(){
		return lesCases.toString();
	}
	
	public static void main(String args[]){
		MToucan mt = new MToucan(2);
		Case c = new Case();
		Case c2 = new Case(5, 5);
		
		mt.ajouterCase(c);
		mt.ajouterCase(c2);
		mt.creerLesMouvements();
		System.out.println(mt.toString());
	}
}
