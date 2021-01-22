package Day16;
class Unit {
	private int Cost, Energy, AttackRate,DefenceRate;
	private double MoveSpeed;
	private String AtkType,UnitType;
	public int getCost() {
		return Cost;
	}
	public void setCost(int cost) {
		Cost = cost;
	}
	public int getEnergy() {
		return Energy;
	}
	public void setEnergy(int energy) {
		Energy = energy;
	}
	public int getAttackRate() {
		return AttackRate;
	}
	public void setAttackRate(int attackRate) {
		AttackRate = attackRate;
	}
	public int getDefenceRate() {
		return DefenceRate;
	}
	public void setDefenceRate(int defenceRate) {
		DefenceRate = defenceRate;
	}
	public double getMoveSpeed() {
		return MoveSpeed;
	}
	public void setMoveSpeed(double moveSpeed) {
		MoveSpeed = moveSpeed;
	}
	public String getAtkType() {
		return AtkType;
	}
	public void setAtkType(String atkType) {
		AtkType = atkType;
	}
	public String getUnitType() {
		return UnitType;
	}
	public void setUnitType(String unitType) {
		UnitType = unitType;
	}
	
}
class Zergling extends Unit {
	Zergling(int cost, int energy, int atkRate, int defRate, String atkType, double moveSpeed, String unitType)
	{
		this.setCost(cost);
		this.setEnergy(energy);
		this.setAttackRate(atkRate);
		this.setDefenceRate(defRate);
		this.setAtkType(atkType);
		this.setMoveSpeed(moveSpeed);
		this.setUnitType(unitType);
	}
}
class Marine extends Unit {
	Marine(int cost, int energy, int atkRate, int defRate, String atkType, double moveSpeed, String unitType)
	{
		this.setCost(cost);
		this.setEnergy(energy);
		this.setAttackRate(atkRate);
		this.setDefenceRate(defRate);
		this.setAtkType(atkType);
		this.setMoveSpeed(moveSpeed);
		this.setUnitType(unitType);
	}
}
class Hydra extends Unit {
	Hydra(int cost, int energy, int atkRate, int defRate, String atkType, double moveSpeed, String unitType)
	{
		this.setCost(cost);
		this.setEnergy(energy);
		this.setAttackRate(atkRate);
		this.setDefenceRate(defRate);
		this.setAtkType(atkType);
		this.setMoveSpeed(moveSpeed);
		this.setUnitType(unitType);
	}
}
class StarCraftGame {
	Zergling zerg;
	Marine mar[] = new Marine[3];
	Hydra hyd;
	void run()
	{
		for(int i=0;i<mar.length;i++)
		{
			mar[i] = new Marine();
		}
	}
}

public class Q36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
