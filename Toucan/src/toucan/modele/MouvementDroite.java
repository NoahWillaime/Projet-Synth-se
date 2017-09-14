	package toucan.modele;

public class MouvementDroite extends Mouvement{
	public MouvementDroite(int temps, int duree, int x, int y){
		super(temps, duree, x, y);
		xAr = x + duree;
		yAr = y;
		tempsAr = temps + duree;
	}
}
