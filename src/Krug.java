
public class Krug {
	private Tacka point;
	private double poluprecnik;
	
	public Krug (){
		this.point=new Tacka();
		this.poluprecnik=0;
	}
	public Krug (Tacka point,double poluprecnik){
		this.point=new Tacka(point);
		this.poluprecnik=poluprecnik;
	}
	public boolean equals(Krug drugi){
		if(this.point.equals(drugi.point) && this.poluprecnik==drugi.poluprecnik)
			return true;
		return false;
		}
	public String toString(){
		StringBuilder sb= new StringBuilder();
		sb.append("Poluprecnik: ");
		sb.append(this.poluprecnik);
		sb.append(point.toString());
		return sb.toString();
	}
	
}
