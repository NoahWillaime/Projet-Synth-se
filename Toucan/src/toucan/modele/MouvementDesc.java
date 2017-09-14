package toucan.modele;

public class MouvementDesc extends Mouvement{
	public MouvementDesc(int temps, int duree, int x, int y){
		super(temps, duree, x, y);
		xAr = x;
		yAr = y + duree;
		tempsAr = temps + duree;
	}
}
