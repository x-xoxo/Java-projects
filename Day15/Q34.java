package Day15;

import java.util.Scanner;

class Tire {
	String name;
	String dateOfManufacture;
	int diameter;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

}

class Engin {
	int horsePower, size;

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class Car {
	Tire tire[] = new Tire[4];
	Engin engin;
	String name, color;
	void drive()
	{
		System.out.println("차이름은 "+name+"이고 색은 "+color+"색이다. 바퀴의 제조사는 "+tire[0].getName()+"이고 지름은"+tire[0].getDiameter()+", 생산된 날짜는 "+tire[0].getDateOfManufacture()+"/ 엔진의 마력은 "+engin.getHorsePower()+" 사이즈는 "+engin.getSize()+"입니다.");
	}

}
class Bicycle {
	Tire tire[] = new Tire[2];
	String color, name;
	void ride()
	{
		System.out.println("자전거명은"+name+"이고"+color+"색이다. 바퀴의 제조사는"+tire[0].getName()+"이고 지름은 "+tire[0].getDiameter()+", 생산된 날짜는 "+tire[0].getDateOfManufacture()+" 이다.");
	}
}
class Motorcycle {
	Tire tire[] = new Tire[2];
	Engin engin;
	String color, name;
	void drive()
	{
		System.out.println("오토바이명은 "+name+"이고 색은 "+color+"색이다. 바퀴의 제조사는 "+tire[0].getName()+"이고 지름은"+tire[0].getDiameter()+", 생산된 날짜는 "+tire[0].getDateOfManufacture()+"/ 엔진의 마력은 "+engin.getHorsePower()+" 사이즈는 "+engin.getSize()+"입니다.");
	}
}
class Airplane {
	String type, airLineName;
	Engin engin;
	Tire tire[] = new Tire[4];
}
class FactoryTire {
	Tire tire[] = new Tire[26];
}
class FactoryEngin {
	Engin engin[] = new Engin[16];
}
class FactoryCar {
	Car car[] = new Car[2];
}
class FactoryBicycle {
	Bicycle bicycle[] = new Bicycle[2];
}
class FactoryMotorcycle {
	Motorcycle motorcycle[] = new Motorcycle[2];
}
class FactoryAirplane {
	Airplane airplane[] = new Airplane[2];
}
class Buyer {
	Car car[] = new Car[2];
	Bicycle bicycle[] = new Bicycle[2];
	Motorcycle motorcycle[] = new Motorcycle[2];
	Airplane airplane[] = new Airplane[2];
}
class MasterControl {
	FactoryEngin fEngin = new FactoryEngin();
	FactoryTire fTire = new FactoryTire();
	FactoryCar fCar = new FactoryCar();
	FactoryBicycle fBicycle = new FactoryBicycle();
	FactoryMotorcycle fMotorcycle = new FactoryMotorcycle();
	FactoryAirplane fAirplane = new FactoryAirplane();
	Buyer buyer = new Buyer();
	void start()
	{
		for(int i=0;i<fEngin.engin.length;i++) // 엔진 세팅 0~15 총 16개
		{
			if(i<5) // index 0부터 4까지 (5개)
			{
				fEngin.engin[i].setHorsePower(500); // 마력 500
				fEngin.engin[i].setSize(50); // 크기 50
			}
			else if (i<9) // index 5부터 8까지(4개)
			{
				fEngin.engin[i].setHorsePower(400); // 마력 400
				fEngin.engin[i].setSize(40); // 크기 40
			}
			else if (i<12) // index 9부터 11까지(3개)
			{
				fEngin.engin[i].setHorsePower(450); // 마력 450
				fEngin.engin[i].setSize(20); // 크기 20
			}
			else // 12부터 15까지 (4개)
			{
				fEngin.engin[i].setHorsePower(1000); // 마력 1000
				fEngin.engin[i].setSize(300); // 크기 300
			}
		}
		for(int i=0;i<fTire.tire.length;i++) // 타이어 세팅 0~25 총 26개
		{
			if(i<3) // index 0부터 2까지 (3개) 자동차 전용
			{
				fTire.tire[i].setName("한국타이어");
				fTire.tire[i].setDiameter(20);
				fTire.tire[i].setDateOfManufacture("2021.1.1");
			}
			else if (i<8) // index 3부터 7까지(5개) 자동차 전용
			{
				fTire.tire[i].setName("넥슨타이어");
				fTire.tire[i].setDiameter(16);
				fTire.tire[i].setDateOfManufacture("2020.12.1");
			}
			else if (i<11) // index 8부터 10까지(3개) 자전거 전용
			{
				fTire.tire[i].setName("알톤");
				fTire.tire[i].setDiameter(10);
				fTire.tire[i].setDateOfManufacture("2020.1.1");
			}
			else if (i<12)// index 11까지 (1개) 자전거 전용
			{
				fTire.tire[i].setName("집");
				fTire.tire[i].setDiameter(8);
				fTire.tire[i].setDateOfManufacture("2019.12.31");
			}
			else if (i<16)// index 12부터 15까지 (4개) 오토바이 전용
			{
				fTire.tire[i].setName("넥슨타이어");
				fTire.tire[i].setDiameter(14);
				fTire.tire[i].setDateOfManufacture("2020.07.27");
			}
			else // index 16부터 25까지 (10개) 비행기 전용
			{
				fTire.tire[i].setName("Bridgestone");
				fTire.tire[i].setDiameter(1100);
				fTire.tire[i].setDateOfManufacture("2019.02.13");
			}
		}
		int tireCnt = 26, enginCnt = 16;
		while(true)
		{
			for(int i=0; i<fTire.tire.length;i++)
			{
				if (fTire.tire[i] == null)
				{
					tireCnt--;
				}
			}
			for(int i=0; i<fEngin.engin.length;i++)
			{
				if (fEngin.engin[i] == null)
				{
					enginCnt--;
				}
			}
			
		}
	}
}

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
