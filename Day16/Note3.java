package Day16;
class Points {
	private int x,y;
	public Points() {
		this.x = this.y = 0;
	}
	public Points(int x, int y) {
		this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoints extends Points {
	private String color;
	public ColorPoints(int x, int y, String color) {
		super(x,y);
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
public class Note3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ColorPoints(5, 6, "blue").showColorPoint();
	}

}
