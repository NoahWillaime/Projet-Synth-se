package toucan.modele;

public class Case {
	private LesMouvs m;
	private int tempMax;
	
	public Case(){
		this.m = new LesMouvs(0, 0);
		this.tempMax = 0;
	}
	
	public Case(int x1, int y1){
		this.m = new LesMouvs(x1, y1);
		this.tempMax = 0;
	}
	
	public void droite(int d){
		this.m.droite(d);
		this.tempMax += d;
	}
	
	public int posX(int t){
		for (Mouvement mv : this.m){
			if (mv.gettempsAr() > t){
				if (mv.getxIn() < mv.getxAr())
					return mv.getxIn() + (t - mv.gettempsIn());
				else if (mv.getxIn() > mv.getxAr())
					return mv.getxIn() - (t - mv.gettempsIn());
				else if (mv.getxIn() == mv.getxAr())
					return mv.getxAr();
			} else if (mv.gettempsAr() == t){
				return mv.getxAr();
			}
		}
		return this.m.lastmoove().getxAr();
	}
	
	public int posY(int t){
		for (Mouvement mv : this.m){
			if (mv.gettempsAr() > t){
				if (mv.getyIn() < mv.getyAr())
					return mv.getyIn() + (t - mv.gettempsIn());
				else if (mv.getyIn() > mv.getyAr())
					return mv.getyIn() - (t - mv.gettempsIn());
				else if (mv.getyIn() == mv.getyAr())
					return mv.getyIn();
			} else if (mv.gettempsAr() == t){
				return mv.getyAr();
			}
		}
		return this.m.lastmoove().getyAr();
	}
	
	public int getTempsMax(){
		return tempMax;
	}
	
	public String toString(){
		return m.toString();
	}
}
