package Day12;

import java.util.Scanner;

class Car {
	String color = "";
	String maker = "";
	int maxSpeed;

	public void drive() {
		System.out.println(color + " " + maker + "차, 최고속도" + maxSpeed + "Km/h 로 달립니다.");
	}
}

class Bike {
	String maker = "";
	String purpose = "";

	public void ride() {
		System.out.println(maker + "의 " + purpose + "자전거를 탑니다.");
	}
}

class Autobike {
	String color = "";
	String maker = "";
	int maxSpeed;

	public void drive() {
		System.out.println(color + " " + maker + "오토바이, 최고속도" + maxSpeed + "Km/h 로 달립니다.");
	}
}

class Person1 {
	Car ca1 = new Car();
	Car ca2 = new Car();

	public void drive(Car ca) {
		System.out.print("1번 사람이 ");
		ca.drive();
	}
}

class Person2 {
	Autobike ab = new Autobike();
	Bike bi = new Bike();

	public void drive(Autobike ab) {
		System.out.print("2번 사람이 ");
		ab.drive();
	}

	public void ride(Bike bi) {
		System.out.print("2번 사람이 ");
		bi.ride();
	}
}

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person1 ps1 = new Person1();
		Person2 ps2 = new Person2();
		ps1.ca1.color = "검정";
		ps1.ca1.maker = "BMW";
		ps1.ca1.maxSpeed = 240;
		ps1.ca2.color = "형광";
		ps1.ca2.maker = "현대";
		ps1.ca2.maxSpeed = 180;
		ps1.drive(ps1.ca1);
		ps1.drive(ps1.ca2);
		ps2.bi.maker = "삼천리";
		ps2.bi.purpose = "산악용";
		ps2.ab.color = "빨간색";
		ps2.ab.maker = "대림";
		ps2.ab.maxSpeed = 180;
		ps2.drive(ps2.ab);
		ps2.ride(ps2.bi);
	}

}
