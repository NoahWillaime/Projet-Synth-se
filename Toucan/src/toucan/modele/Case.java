package toucan.modele;

public class Case {
	private LesMouvs m;
	private int tempMax;
	private int delay;
	
	public Case(){
		this.m = new LesMouvs(0, 0);
		this.tempMax = 0;
		this.delay = 0;
	}
	
	public Case(int x1, int y1){
		this.m = new LesMouvs(x1, y1);
		this.tempMax = 0;
		this.delay = 0;
	}
	
	public void addDelay(int d){
		this.delay = d;
		this.tempMax += this.delay;
	}
	
	public void droite(int d){
		this.m.droite(d, this.delay);
		this.tempMax += d;
	}
	
	public void gauche(int d){
		this.m.gauche(d, this.delay);
		this.tempMax += d;
	}
		
	public void monter(int d){
		this.m.monter(d, this.delay);
		this.tempMax += d;
	}
			
	public void descendre(int d){
		this.m.descendre(d, this.delay);
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
			if (mv.gettempsAr() > t && mv.gettempsIn() <= t){
				if (mv.getyIn() < mv.getyAr())
					return mv.getyIn() + (t - mv.gettempsIn());
				else if (mv.getyIn() > mv.getyAr()){
					return mv.getyIn() - (t - mv.gettempsIn());
				}
				else if (mv.getyIn() == mv.getyAr())
					return mv.getyIn();
			} else if (mv.gettempsAr() == t){
				return mv.getyAr();
			} else if (mv.gettempsIn() > t) {
				return mv.getyIn();
			}
		}
		return this.m.lastmoove().getyAr();
	}
	
	public int getTempsMax(){
		return tempMax;
	}
	
	public int getDelay(){
		return delay;
	}
	
	public String toString(){
		return m.toString();
	}
}
