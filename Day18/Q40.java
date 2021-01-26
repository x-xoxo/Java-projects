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
		System.out.println("주행거리 : "+getTotalDist());
	}
	void showGage()
	{
		System.out.println("게이지 : "+getGage());
	}
	abstract void move();
}
class Cars extends Vehicle implements Booster {

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
	void run()
	{
		
	}
	
}

public class Q40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
