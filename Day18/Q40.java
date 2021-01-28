package Day18;

import java.util.Random;

interface Booster {
	void Boost();
}
abstract class Vehicle {
	private int totalDist, gage;
	Random r = new Random();

	public int getTotalDist() {
		return totalDist;
	}

	public void setTotalDist(int totalDist) {
		this.totalDist = totalDist;
	}

	public int getGage() {
		return gage;
	}

	public void setGage(int gage) {
		this.gage = gage;
	}
	void showTotalDist()
	{
		System.out.println("주행거리 : "+getTotalDist()+"m");
	}
	void showGage()
	{
		System.out.println("게이지 : "+getGage());
	}
	abstract void move();
}
class Cars extends Vehicle implements Booster {
	public Cars()
	{
		setGage(0);
		setTotalDist(0);
	}

	@Override
	void move() {
		setTotalDist(getTotalDist()+r.nextInt(21));
	}

	@Override
	public void Boost() {
		move();
		setTotalDist(getTotalDist()+2);
	}

}

class Bicycles extends Vehicle implements Booster {
	public Bicycles() {
		setGage(0);
		setTotalDist(0);
	}

	@Override
	void move() {
		setTotalDist(getTotalDist()+r.nextInt(11));
	}

	@Override
	public void Boost() {
		move();
		setTotalDist(getTotalDist()+5);
	}

}

class Motorcycles extends Vehicle implements Booster {
	public Motorcycles() {
		setGage(0);
		setTotalDist(0);
	}

	@Override
	void move() {
		setTotalDist(getTotalDist()+r.nextInt(16));
	}

	@Override
	public void Boost() {
		move();
		setTotalDist(getTotalDist()+3);
	}

}
class VehicleControl {
	Cars car = new Cars();
	Bicycles bicycle = new Bicycles();
	Motorcycles motorcycle = new Motorcycles();
	Random r = new Random();
	void run()
	{
		while(true)
		{
			if(car.getTotalDist()>=500||bicycle.getTotalDist()>=500||motorcycle.getTotalDist()>=500)
				break;
			int moveable = r.nextInt(3)+1;
			if(moveable!=1)
			{
				if(car.getGage() == 4)
				{
					car.Boost();
					car.setGage(0);
					System.out.print("자동차의 ");
					car.showTotalDist();
					System.out.print("자동차의 ");
					car.showGage();
				}
				else
				{
					car.move();
					car.setGage(car.getGage()+1);
					System.out.print("자동차의 ");
					car.showTotalDist();
					System.out.print("자동차의 ");
					car.showGage();
				}
			}
			if(moveable != 2)
			{
				if(bicycle.getGage() == 2)
				{
					bicycle.Boost();
					bicycle.setGage(0);
					System.out.print("자전거의 ");
					bicycle.showTotalDist();
					System.out.print("자전거의 ");
					bicycle.showGage();
				}
				else
				{
					bicycle.move();
					bicycle.setGage(bicycle.getGage()+1);
					System.out.print("자전거의 ");
					bicycle.showTotalDist();
					System.out.print("자전거의 ");
					bicycle.showGage();
				}
			}
			if(moveable != 3)
			{
				if(motorcycle.getGage() == 3)
				{
					motorcycle.Boost();
					motorcycle.setGage(0);
					System.out.print("오토바이의 ");
					motorcycle.showTotalDist();
					System.out.print("오토바이의 ");
					motorcycle.showGage();
				}
				else
				{
					motorcycle.move();
					motorcycle.setGage(motorcycle.getGage()+1);
					System.out.print("오토바이의 ");
					motorcycle.showTotalDist();
					System.out.print("오토바이의 ");
					motorcycle.showGage();
				}
			}
		}
		if(car.getTotalDist()>=500)
			System.out.println("차가 결승선을 통과하였습니다.");
		if(bicycle.getTotalDist()>=500)
			System.out.println("자전거가 결승선을 통과하였습니다.");
		if(motorcycle.getTotalDist()>=500)
			System.out.println("오토바이가 결승선을 통과하였습니다.");
	}

}

public class Q40 {

	public static void main(String[] args) {
		new VehicleControl().run();
	}

}
