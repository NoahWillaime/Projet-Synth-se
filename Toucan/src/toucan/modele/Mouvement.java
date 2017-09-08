package toucan.modele;

public abstract class Mouvement {
	private int tempsIn;
	private int d;
	private int xIn;
	private int yIn;
	protected int xAr;
	protected int yAr;
	protected int tempsAr;
	
	public Mouvement(int temps, int duree, int x, int y){
		this.tempsIn = temps;
		this.tempsAr = temps + duree;
		this.d = duree;
		this.xIn = x;
		this.yIn = y;
	}
	
	public int getxAr(){
		return xAr;
	}
	
	public int getyAr(){
		return yAr;
	}
	
	public int getxIn(){
		return xIn;
	}
	
	public int getyIn(){
		return yIn;
	}
	
	public int gettempsIn(){
		return tempsIn;
	}
	
	public int gettempsAr(){
		return tempsAr;
	}
	
	public String toString(){
		System.out.println(d);
		return d+"";
	}
}
