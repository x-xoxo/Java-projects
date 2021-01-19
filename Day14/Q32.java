package Day14;

import java.util.Random;

class Player {
	int LaneNum, DistMoved=0,totalMoved=0;
	public int getTotalMoved() {
		return totalMoved;
	}
	public void setTotalMoved(int totalMoved) {
		this.totalMoved = totalMoved;
	}
	String CountryName;
	boolean Runable;
	
	public boolean isRunable() {
		return Runable;
	}
	public void setRunable(boolean runable) {
		Runable = runable;
	}
	public int getLaneNum() {
		return LaneNum;
	}
	public void setLaneNum(int laneNum) {
		LaneNum = laneNum;
	}
	public int getDistMoved() {
		return DistMoved;
	}
	public void setDistMoved(int distMoved) {
		DistMoved = distMoved;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
}

public class Q32 
{
	

	public static void main(String[] args) 
	{
		Random rand = new Random();
		Player p[] = new Player[4];
		for(int i=0; i<p.length;i++)
		{
			p[i] = new Player();
		}
		p[0].setCountryName("한국");
		p[0].setLaneNum(1);
		p[1].setCountryName("중국");
		p[1].setLaneNum(2);
		p[2].setCountryName("미국");
		p[2].setLaneNum(3);
		p[3].setCountryName("러시아");
		p[3].setLaneNum(4);
		while(true)
		{
			int num = rand.nextInt(4);
			for(int i=0;i<p.length;i++)
			{
				p[i].setRunable(true);
			}
			p[num].setRunable(false);
			
			for(int i=0;i<p.length;i++)
			{
				if(p[i].isRunable())
				{
					int dist = rand.nextInt(10)+1;
					p[i].setDistMoved(dist);
					p[i].setTotalMoved(p[i].getTotalMoved()+p[i].getDistMoved());
					System.out.println(p[i].getLaneNum()+"번 레인 "+"현재 거리 : "+p[i].getTotalMoved()+"M");
				}
			}
			if(p[0].getTotalMoved()>=100||p[1].getTotalMoved()>=100||p[2].getTotalMoved()>=100||p[3].getTotalMoved()>=100)
			{
				for(int i=0; i<p.length; i++)
				{
					if(p[i].getTotalMoved()>=100)
					{
						System.out.println("우승국 : "+p[i].getCountryName());
					}
				}
				break;
			}
		}
	}

}
