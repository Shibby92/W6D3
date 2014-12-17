
public class Tacka {
	private int x;
	private int y;
	public Tacka(){
		this.x=0;
		this.y=0;
	}
	public Tacka(int x, int y){
		this.x=x;
		this.y=y;
	}
	public Tacka (Tacka other){
		this.x=other.x;
		this.y=other.y;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("("+this.x+","+this.y+")\n");
		return sb.toString();
	}
	public boolean equals (Tacka other){
		if(this.x==other.x && this.y==other.y)
			return true;
		return false;
	}
	public double distance(Tacka b){
		return Math.sqrt(Math.pow((b.x-this.x), 2)+Math.pow((b.y-this.y),2));
	}

}
