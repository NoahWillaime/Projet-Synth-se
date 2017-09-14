package toucan.modele;

import java.util.ArrayList;
import java.util.Iterator;

public class LesMouvs implements Iterable<Mouvement>{
	private ArrayList<Mouvement> mooves;
	private int xIn;
	private int yIn;
	
	public LesMouvs(int x, int y){
		this.mooves = new ArrayList<Mouvement>();
		this.xIn = x;
		this.yIn = y;
	}
	
	public void droite(int d, int delay){
		if (mooves.isEmpty()){
			Mouvement m = new MouvementDroite(delay, d, xIn, yIn);
			ajouter(m);
		} else {
			int index = mooves.size() - 1;
			Mouvement temp = mooves.get(index);
			Mouvement m = new MouvementDroite(temp.gettempsAr(), d, temp.getxAr(), temp.getyAr());
			ajouter(m);
		}
	}
	
	public void gauche(int d, int delay){
		if (mooves.isEmpty()){
			Mouvement m = new MouvementGauche(delay, d, xIn, yIn);
			ajouter(m);
		} else {
			int index = mooves.size() - 1;
			Mouvement temp = mooves.get(index);
			Mouvement m = new MouvementGauche(temp.gettempsAr(), d, temp.getxAr(), temp.getyAr());
			ajouter(m);
		}
	}	
	
	public void monter(int d, int delay){
		if (mooves.isEmpty()){
			Mouvement m = new MouvementMonter(delay, d, xIn, yIn);
			ajouter(m);
		} else {
			int index = mooves.size() - 1;
			Mouvement temp = mooves.get(index);
			Mouvement m = new MouvementMonter(temp.gettempsAr(), d, temp.getxAr(), temp.getyAr());
			ajouter(m);
		}
	}
	
	public void descendre(int d, int delay){
		if (mooves.isEmpty()){
			Mouvement m = new MouvementDesc(delay, d, xIn, yIn);
			ajouter(m);
		} else {
			int index = mooves.size() - 1;
			Mouvement temp = mooves.get(index);
			Mouvement m = new MouvementDesc(temp.gettempsAr(), d, temp.getxAr(), temp.getyAr());
			ajouter(m);
		}
	}
	
	public Mouvement lastmoove(){
		return mooves.get(mooves.size() - 1);
	}
	
	public Iterator<Mouvement> iterator(){
		return mooves.iterator();
	}
	
	private void ajouter(Mouvement p){
		mooves.add(p);
	}

	@Override
	public String toString() {
		return "LesMouvs [mooves=" + mooves + "]";
	}
}
