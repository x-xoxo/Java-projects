package Day11;

class Pencil {
	String color = "";

	public void draw() {
		System.out.println("쓰는 기능은 " + color + "연필로 적습니다.");
	}
}

class Eraser {
	String brand = "";

	public void erase() {
		System.out.println("지우개를 " + brand + "의 제품으로 지웁니다.");

	}
}

class Pen {

	String color = "";
	String maker = "";

	public void draw() {
		System.out.println("펜을 " + maker + " 제품의 " + color + " 으로 씁니다.");

	}
}

public class Q26 {

	public static void main(String[] args) {
		Pencil redpe = new Pencil();
		Pencil bluepe = new Pencil();
		Pencil yellpe = new Pencil();
		Pencil orape = new Pencil();

		Pen p1 = new Pen();
		Pen p2 = new Pen();
		Pen p3 = new Pen();

		Eraser er1 = new Eraser();
		Eraser er2 = new Eraser();

		redpe.color = "빨간";
		bluepe.color = "파랑";
		yellpe.color = "노랑";
		orape.color = "주황색";

		redpe.draw();
		bluepe.draw();
		yellpe.draw();
		orape.draw();

		p1.color = "검정색";
		p1.maker = "모나미";
		p2.color = "초록색";
		p2.maker = "제트스트림";
		p3.color = "베이비블루";
		p3.maker = "워터맨";

		p1.draw();
		p2.draw();
		p3.draw();

		er1.brand = "잠자리";
		er2.brand = "모닝글로리";

		er1.erase();
		er2.erase();
	}

}
