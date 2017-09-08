package toucan.modele;

public class Case {
	private LesMouvs m;
	
	public Case(){
		this.m = new LesMouvs(0, 0);
	}
	
	public Case(int x1, int y1){
		this.m = new LesMouvs(x1, y1);
	}
	
	public void droite(int d){
		this.m.droite(d);
	}
	
	public int posX(int t){
		for (Mouvement mv : this.m){
			if (mv.gettempsAr() <= t){
				if (mv.gettempsAr() == t){
					return mv.getxAr();
				} else {
					return mv.getxIn()+(t - mv.getxIn());
				}
			}
		}
		return this.m.lastmoove().getxAr();
	}
	
	public int posY(int t){
		for (Mouvement mv : this.m){
			if (mv.gettempsAr() <= t){
				if (mv.gettempsAr() == t){
					return mv.getyAr();
				} else {
					return mv.getyIn()+(t - mv.getyIn());
				}
			}
		}
		return this.m.lastmoove().getyAr();
	}
	
	public static void main(String args[]){
		Case c1 = new Case();
		
		c1.droite(3);
		c1.droite(5);
		c1.droite(8);
		System.out.println("X : "+c1.posX(2)+ " / Y : "+c1.posY(2));
	}
}
