package Day14;

import java.util.Scanner;
import java.util.Random;

class Fish {
	String name = "참치";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Lake {
	Fish fs[][] = new Fish[5][5];
}
class Fisher {
	int fishBag = 0;
	
	public int getFishBag() {
		return fishBag;
	}

	public void setFishBag(int fishBag) {
		this.fishBag = fishBag;
	}

	void move()
	{
		
	}
}
class GameControl {
	Random rand = new Random();
	Fisher gamer = new Fisher();
	Lake hosu = new Lake();
	void setFishData()
	{
		for(int i=0; i<3; i++)
		{
			int x = rand.nextInt(5);
			int y = rand.nextInt(5);
			if(hosu.fs[x][y]!=null)
			{
				i--;
			}
			else
			{
				hosu.fs[x][y] = new Fish();
			}
		}
	}
	Fish getFishData(int x, int y)
	{
		return hosu.fs[x][y];
	}
}

public class Q31 
{

	public static void main(String[] args) 
	{

	}

}
