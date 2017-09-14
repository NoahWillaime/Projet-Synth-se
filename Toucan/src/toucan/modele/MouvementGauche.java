package toucan.modele;

public class MouvementGauche extends Mouvement{
	public MouvementGauche(int temps, int duree, int x, int y){
		super(temps, duree, x, y);
		xAr = x - duree;
		yAr = y;
		tempsAr = temps + duree;
	}
}
