package toucan.modele;

public class MouvementMonter extends Mouvement{
	public MouvementMonter(int temps, int duree, int x, int y){
		super(temps, duree, x, y);
		xAr = x;
		yAr = y - duree;
		tempsAr = temps + duree;
	}
}
