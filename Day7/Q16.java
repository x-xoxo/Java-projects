package Day7;

import java.util.Random;
import java.util.Scanner;

public class Q16 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int lake[][] = new int[5][5];
		int fishCount=3;
		int fishRow[]=new int[3], fishCol[]=new int[3];
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
					}
					else
					{
						System.out.println("1.Up 2.Down 3.Left 4.Right");
					}
				}
			}
		}
		
		
	}

}
