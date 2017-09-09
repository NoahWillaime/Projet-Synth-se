package toucan.modele;

import java.util.ArrayList;

public class LesCases {
	private ArrayList<Case> lesCases;
	private int tempsMax;
	
	public LesCases(){
		this.lesCases = new ArrayList<Case>();
	}
	
	public LesCases(int nbCase){
		this.lesCases = new ArrayList<Case>(nbCase);
	}
	
	public void ajouter(Case c){
		this.lesCases.add(c);
	}
	
	public void droite(int index, int temps){
		if (index < lesCases.size()){
			lesCases.get(index).droite(temps);
			if (lesCases.get(index).getTempsMax() > tempsMax){
				tempsMax = lesCases.get(index).getTempsMax();
			}
		}
	}
	
	public int getMaxTemps(){
		return tempsMax;
	}
	
    @Override
    public String toString() {
        int maxTemps = getMaxTemps() ;
        StringBuilder sb = new StringBuilder() ;
        for (int i = 0 ; i < lesCases.size() ; i++) {
            sb.append("Case " + i + ": ") ;
            Case c = lesCases.get(i) ;
            for (int t = 0 ; t <= maxTemps ; t++) {
                int x = c.posX(t) ;
                int y = c.posY(t) ;
                sb.append("\t" + t + " (" + x + "," + y + ") ") ;
                if (t % 5 == 0) {
                    sb.append("\n\t") ;
                }
            }
            sb.append("\n") ;
        }
        return sb.toString() ;
    }
}
