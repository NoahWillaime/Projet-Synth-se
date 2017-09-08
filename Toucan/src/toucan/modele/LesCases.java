package toucan.modele;

import java.util.ArrayList;

public class LesCases {
	private ArrayList<Case> cases;
	
	public LesCases(){
		this.cases = new ArrayList<Case>();
	}
	
	public LesCases(int nbCase){
		this.cases = new ArrayList<Case>(nbCase);
	}
	
	public void ajouter(Case c){
		this.cases.add(c);
	}
}
