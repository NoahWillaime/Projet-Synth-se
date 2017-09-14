package toucan.modele;

public class MToucan {
	private LesCases lesCases;
	
	public MToucan(int nbCases){
		this.lesCases = new LesCases(nbCases);
	}
	
	public void creerLesMouvements(){
		lesCases.monter(0, 10) ;
		//lesCases.descendre(1, 10) ;
	}
	
	public void ajouterCase(Case c){
		this.lesCases.ajouter(c);
	}
	
	public String toString(){
		return lesCases.toString();
	}
	
	public static void main(String args[]){
		MToucan mt = new MToucan(1);
		Case c = new Case(10, 10);
		Case c2 = new Case(20, 10);
		
		c.addDelay(2);
		mt.ajouterCase(c);
		mt.creerLesMouvements();
		System.out.println(mt.toString());
	}
}
