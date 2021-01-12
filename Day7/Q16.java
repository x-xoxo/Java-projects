package Day7;

import java.util.Random;
import java.util.Scanner;

public class Q16 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int lake[][] = new int[5][5];
		int fishCount=3;
		int fishRow[]=new int[3], fishCol[]=new int[3];
		final int UP=1, DOWN=2, LEFT=3,RIGHT=4;
		for(int i=0; i<fishCount; i++)
		{
			fishRow[i] = rand.nextInt(lake.length);
			fishCol[i] = rand.nextInt(lake[fishRow[i]].length);
			if(i>=1)
			{
				if(fishRow[i]==fishRow[i-1] && fishCol[i]==fishCol[i-1])
				{
					i--;
				}
			}
		}
		for(int i=0; i<fishCount;i++)
		{
			System.out.println((i+1)+"번 물고기 좌표: ["+fishRow[i]+","+fishCol[i]+"]");
			lake[fishRow[i]][fishCol[i]] = 1;
		}
		while(fishCount != 0)
		{
			System.out.println("캐스팅할 좌표를 입력해주세요(X , Y): ");
			int inputX = sc.nextInt();
			int inputY = sc.nextInt();
			if(!(inputX>=0 && inputX<=4 && inputY>=0 && inputY<=4))
			{
				System.out.println("잘못된 입력입니다. 다시 캐스팅 해주세요");
			}
			else
			{
				while(fishCount != 0)
				{
					if(lake[inputX][inputY]==1)
					{
						System.out.println("물고기를 잡았습니다!");
						fishCount--;
						lake[inputX][inputY] = 0;
					}
					if(fishCount == 0)
					{
						System.out.println("물고기를 다 잡았습니다!");
						break;
					}
					System.out.println("현재 좌표 : [ "+ inputX + "," + inputY + " ]");
					System.out.println("남은 물고기 수: " + fishCount);
					System.out.println("1.Up 2.Down 3.Left 4.Right");
					int moveDirection = sc.nextInt();
					if(!(moveDirection>=UP && moveDirection<=RIGHT))
					{
						System.out.println("잘못된 입력입니다.");
					}
					else
					{
						if(moveDirection==UP||moveDirection==DOWN)
						{
							if(moveDirection==UP)
							{
								if(inputY==0)
								{
									System.out.println("더 이상 이동할 곳이 없습니다.");
									continue;
								}
								inputY--;
							}
							else
							{
								if(inputY==4)
								{
									System.out.println("더 이상 이동할 곳이 없습니다.");
									continue;
								}
								inputY++;
							}
						}
						else
						{
							if(moveDirection==LEFT)
							{
								if(inputX==0)
								{
									System.out.println("더 이상 이동할 곳이 없습니다.");
									continue;
								}
								inputX--;
							}
							else
							{
								if(inputX==4)
								{
									System.out.println("더 이상 이동할 곳이 없습니다.");
									continue;
								}
								inputX++;
							}
						}
					}
				}
			}
		}
		sc.close();
		
	}

}
