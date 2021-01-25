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
	public void attack(Zergling unit)
	{
		unit.setEnergy(unit.getEnergy()-(this.getAttackRate()-unit.getDefenceRate()));
	}
	public void attack(Marine unit)
	{
		unit.setEnergy(unit.getEnergy()-(this.getAttackRate()-unit.getDefenceRate()));
	}
	public void attack(Hydra unit)
	{
		unit.setEnergy(unit.getEnergy()-(this.getAttackRate()-unit.getDefenceRate()));
	}
	public boolean lifeCheck()
	{
		if(this.getEnergy()<=0)
			return false;
		else
			return true;
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
	void prtInfo()
	{
		System.out.println("저글링의 생산비용은 "+this.getCost()+" 미네랄, 체력 "+this.getEnergy()+", 공격력 "+this.getAttackRate()+", 방어력 "+this.getDefenceRate()+", 공격타입 "+this.getAtkType()+", 이동속도 "+this.getMoveSpeed()+", 유닛특성 "+this.getUnitType()+" 입니다.");
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
	void prtInfo()
	{
		System.out.println("마린의 생산비용은 "+this.getCost()+" 미네랄, 체력 "+this.getEnergy()+", 공격력 "+this.getAttackRate()+", 방어력 "+this.getDefenceRate()+", 공격타입 "+this.getAtkType()+", 이동속도 "+this.getMoveSpeed()+", 유닛특성 "+this.getUnitType()+" 입니다.");
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
	void prtInfo()
	{
		System.out.println("히드라의 생산비용은 "+this.getCost()+" 미네랄, 체력 "+this.getEnergy()+", 공격력 "+this.getAttackRate()+", 방어력 "+this.getDefenceRate()+", 공격타입 "+this.getAtkType()+", 이동속도 "+this.getMoveSpeed()+", 유닛특성 "+this.getUnitType()+" 입니다.");
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
			mar[i] = new Marine(50,50,6,0,"지상",2.612,"지상,중형,생체");
			mar[i].prtInfo();
		}
		zerg = new Zergling(50,35,5,0,"지상",2.612,"지상,소형,생체");
		zerg.prtInfo();
		hyd = new Hydra(100,80,10,0,"지상,공중",1.875,"지상,소형,생체");
		hyd.prtInfo();
		while(true)
		{
			for(int i=0;i<mar.length;i++)
			{
				if (zerg == null)
					break;
				if (mar[i].lifeCheck())
					mar[i].attack(zerg);
				else
					mar[i] = null;
				if (zerg.lifeCheck())
				{
					if(mar[i]==null)
						continue;
					else
						zerg.attack(mar[i]);
				}
				else
					zerg = null;
			}
			if(!((mar[0]==null&&mar[1]==null&&mar[2]==null)||zerg==null))
			{
				continue;
			}
			if(zerg==null)
			{
				for(int i=0;i<mar.length;i++)
				{
					if(hyd == null)
						break;
					if (mar[i] != null)
						mar[i].attack(hyd);
					else
						continue;
					if (hyd.lifeCheck())
					{
						if(mar[i]==null)
							continue;
						else
							hyd.attack(mar[i]);
					}
					else
						hyd = null;
				}
			}
			else
			{
				zerg.attack(hyd);
				if(hyd.lifeCheck())
				{
					hyd.attack(zerg);
				}
				else
					hyd = null;
			}
			if(hyd == null && zerg == null)
			{
				System.out.println("마린 승");
				break;
			}
			else if(mar[0]==null && mar[1]==null&&mar[2]==null&&zerg==null)
			{
				System.out.println("히드라 승");
				break;
			}
			else if(mar[0]==null && mar[1]==null&&mar[2]==null&&hyd==null)
			{
				System.out.println("저글링 승");
				break;
			}
			else
				continue;
		}
	}
}

public class Q36 {

	public static void main(String[] args) {
		new StarCraftGame().run();
	}

}
