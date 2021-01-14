package Day11;

import java.util.Random;
import java.util.Scanner;

public class Q25 
{
	public static int[] randomFishRow(int fishCount, Random rand)
	{
		int fishRow[]=new int[fishCount];
		int lake[][] = new int[5][5];
		for(int i=0; i<fishCount; i++)
		{
			fishRow[i] = rand.nextInt(lake.length);

			if(i>=1)
			{
				if(fishRow[i]==fishRow[i-1])
				{
					i--;
				}
			}
		}
		return fishRow;
	}

	public static int[] randomFishCol(int fishCount, Random rand)
	{
		int fishCol[]=new int[fishCount];
		int lake[][] = new int[5][5];
		for(int i=0; i<fishCount; i++)
		{
			fishCol[i] = rand.nextInt(lake.length);

			if(i>=1)
			{
				if(fishCol[i]==fishCol[i-1])
				{
					i--;
				}
			}
		}
		return fishCol;
	}

	public static void printFishCoord(int fishCount, int[] fishRow, int[] fishCol)
	{
		for(int i=0; i<fishCount;i++)
		{
			System.out.println((i+1)+"번 물고기 좌표: ["+fishRow[i]+","+fishCol[i]+"]");
		}
	}

	public static void saveFishCoord(int fishCount, int[][] lake, int[] fishRow, int[] fishCol)
	{
		for(int i=0; i<fishCount;i++)
		{
			lake[fishRow[i]][fishCol[i]] = 1;
		}
	}

	public static int moveUP(int inputY)
	{
		if(inputY==0)
			System.out.println("더 이상 이동할 곳이 없습니다.");
		else
			inputY--;
		return inputY;
	}

	public static int moveDOWN(int inputY)
	{
		if(inputY==4)
			System.out.println("더 이상 이동할 곳이 없습니다.");
		else
			inputY++;
		return inputY;
	}

	public static int moveLEFT(int inputX)
	{
		if(inputX==0)
			System.out.println("더 이상 이동할 곳이 없습니다.");
		else
			inputX--;
		return inputX;
	}

	public static int moveRIGHT(int inputX)
	{
		if(inputX==4)
			System.out.println("더 이상 이동할 곳이 없습니다.");
		else
			inputX++;
		return inputX;
	}

	public static void moveCoord(int fishCount, int[][] lake, int inputX, int inputY, Scanner sc)
	{
		final int UP=1, DOWN=2, LEFT=3,RIGHT=4;
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
			if(!(moveDirection==UP || moveDirection==RIGHT||moveDirection==LEFT||moveDirection==DOWN))
			{
				System.out.println("잘못된 입력입니다.");
			}
			else
			{
				if(moveDirection==UP||moveDirection==DOWN)
				{
					if(moveDirection==UP)
					{
						inputY=moveUP(inputY);
					}
					else
					{
						inputY=moveDOWN(inputY);
					}
				}
				else
				{
					if(moveDirection==LEFT)
					{
						inputX=moveLEFT(inputX);
					}
					else
					{
						inputX=moveRIGHT(inputX);
					}
				}
			}
		}
	}

	public static void startCasting(int fishCount, int[][] lake, Scanner sc)
	{
		while(fishCount != 0)
		{
			System.out.print("캐스팅할 좌표를 입력해주세요(X , Y): ");
			int inputX = sc.nextInt();
			int inputY = sc.nextInt();
			if(!(inputX>=0 && inputX<=4 && inputY>=0 && inputY<=4))
			{
				System.out.println("잘못된 입력입니다. 다시 캐스팅 해주세요");
			}
			else
			{
				moveCoord(fishCount, lake, inputX, inputY, sc);
				break;
			}
		}
	}

	public static void run()
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int lake[][] = new int[5][5];
		int fishCount=3;
		int fishRow[]=randomFishRow(fishCount, rand), fishCol[]=randomFishCol(fishCount, rand);
		saveFishCoord(fishCount, lake, fishRow, fishCol);
		printFishCoord(fishCount, fishRow, fishCol);
		startCasting(fishCount, lake, sc);
		sc.close();
	}

	public static void main(String[] args) 
	{
		run();
	}

}
