package Day19;

interface Repairable {}

class Unit {
	int hitpoint;
	final int MAX_HP;
	Unit(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}
class AirUnit extends Unit {
	AirUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitpoint = MAX_HP;
	}
	public String toString()
	{
		return "Tank";
	}
}
class Marine extends GroundUnit {
	Marine() {
		super(40);
		hitpoint = MAX_HP;
	}
}
class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitpoint = MAX_HP;
	}
	void repair(Repairable r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitpoint!=u.MAX_HP)
			{
				u.hitpoint++;
			}
		}
	}
}

public class StarCraftEX {

	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		tank.hitpoint = 30;
		System.out.println(tank.toString()+"의 체력 : "+tank.hitpoint);
		scv.repair(tank);
		System.out.println(tank.toString()+"의 체력 : "+tank.hitpoint);
//		scv.repair(marine); // Error

	}

}
