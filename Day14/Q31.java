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
	int fisherX,fisherY;
	public int getFisherX() {
		return fisherX;
	}

	public void setFisherX(int fisherX) {
		this.fisherX = fisherX;
	}

	public int getFisherY() {
		return fisherY;
	}

	public void setFisherY(int fisherY) {
		this.fisherY = fisherY;
	}

	int fishBag = 0;

	public int getFishBag() {
		return fishBag;
	}

	public void setFishBag(int fishBag) {
		this.fishBag = fishBag;
	}


}
class GameControl {
	Random rand = new Random();
	Fisher gamer = new Fisher();
	Lake hosu = new Lake();
	void randFishData()
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
	void run()
	{
		Scanner sc = new Scanner(System.in);
		randFishData();
		System.out.println("-----낚시 게임-----");
		while(true)
		{
			System.out.print("캐스팅 좌표를 입력해주세요 > ");
			gamer.setFisherX(sc.nextInt());
			gamer.setFisherY(sc.nextInt());
			if(gamer.getFisherX()<0||gamer.getFisherX()>4||gamer.getFisherY()<0||gamer.getFisherY()>4)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			if(getFishData(gamer.getFisherX(), gamer.getFisherY())!=null)
			{
				System.out.println("물고기를 잡았습니다.");
				gamer.setFishBag(gamer.getFishBag()+1);
			}
			while(true)
			{
				final int UP=1,DOWN=2,LEFT=3,RIGHT=4;
				int direction;
				System.out.println("남은 물고기 : "+ (3-gamer.getFishBag())+"마리");
				System.out.println("현재 좌표 : ["+gamer.getFisherX()+", "+gamer.getFisherY()+"]");
				System.out.println("이동할 방향을 선택하세요");
				System.out.print("1.UP 2.DOWN 3.LEFT 4.RIGHT > ");
				direction = sc.nextInt();
				if(!(direction==UP||direction==DOWN||direction==LEFT||direction==RIGHT))
				{
					System.out.println("잘못된 입력입니다.");
					continue;
				}
				else if (direction == UP)
				{
					if (gamer.getFisherY()==4)
						System.out.println("더 이상 이동할 공간이 없습니다.");
					else
						gamer.setFisherY(gamer.getFisherY()+1);
				}
				else if (direction == DOWN)
				{
					if (gamer.getFisherY()==0)
						System.out.println("더 이상 이동할 공간이 없습니다.");
					else
						gamer.setFisherY(gamer.getFisherY()-1);
				}
				else if (direction == LEFT)
				{
					if (gamer.getFisherX()==0)
						System.out.println("더 이상 이동할 공간이 없습니다.");
					else
						gamer.setFisherX(gamer.getFisherX()-1);
				}
				else
				{
					if (gamer.getFisherX()==4)
						System.out.println("더 이상 이동할 공간이 없습니다.");
					else
						gamer.setFisherX(gamer.getFisherX()+1);
				}
				if(getFishData(gamer.getFisherX(), gamer.getFisherY())!=null)
				{
					System.out.println("물고기를 잡았습니다.");
					gamer.setFishBag(gamer.getFishBag()+1);
					hosu.fs[gamer.getFisherX()][gamer.getFisherY()] = null;
				}
				if(gamer.getFishBag()==3)
				{
					break;
				}
			}
			System.out.println("물고기를 모두 잡았습니다.");
			System.out.println("게임을 종료합니다.");
			break;
		}
		sc.close();
	}
}

public class Q31 
{

	public static void main(String[] args) 
	{
		GameControl gc = new GameControl();
		gc.run();
	}

}
