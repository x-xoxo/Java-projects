package Day10;

import java.util.Random;
import java.util.Scanner;

public class Q22 
{
	public static int inputNum(Scanner sc)
	{
		System.out.println("---Select---");
		System.out.println("1.종료");
		System.out.println("2.숫자야구게임시작");
		int input1 = sc.nextInt();
		return input1;
	}
	
	public static int[] randomNum(Random rand)
	{
		int iComNum[] = new int[3];
		for(int k=0; k<iComNum.length; k++)
		{	
			iComNum[k] = rand.nextInt(9)+1;
			while(iComNum[0]==iComNum[1])
			{
				iComNum[1] = rand.nextInt(9)+1;
			}
			while(iComNum[1]==iComNum[2])
			{
				iComNum[2] = rand.nextInt(9)+1;
			}
		}
		return iComNum;
	}
	
	public static int[] userNum(Scanner sc)
	{
		int iUserNum[] = new int[3];
		for(int i=0; i<iUserNum.length; i++)
		{
			System.out.printf("%d번째 숫자를 입력하세요 : ",i+1);
			iUserNum[i] = sc.nextInt();
		}
		return iUserNum;
	}
	
	public static void result(int[] judge)
	{
		if(judge[0] == 3)
		{
			System.out.println("홈런입니다!");
		}
		else if(judge[0] == 0 && judge[1] == 0)
		{
			System.out.println("아웃입니다.");
		}
		else
		{
			System.out.println(judge[0]+"스트라이크, "+judge[1]+"볼 입니다.");
		}
	}
	
	public static int[] judge(int iComNum[],int iUserNum[])
	{
		int strike = 0, ball=0;
		for(int i=0; i<iComNum.length; i++)
		{
			for(int j=0; j<iUserNum.length; j++)
			{
				if(iUserNum[j] == iComNum[i])
				{
					if(i==j)
					{
						strike++;
					}
					else
					{
						ball++;
					}
				}
			}
		}
		int judge[] = new int[2];
		judge[0] = strike;
		judge[1] = ball;
		return judge;
	}
	public static void err()
	{
		System.out.println("Error: 잘못된 입력입니다.");
	}
	
	public static void turnoff()
	{
		System.out.println("프로그램을 종료합니다.");
	}
	
	public static void start(Scanner sc, Random rand)
	{
		boolean bCheckExit = true;
		while(bCheckExit)
		{
			int input1 = inputNum(sc);
			if(input1 == 1)
			{
				turnoff();
				bCheckExit = false;
			}
			else if(input1 == 2)
			{
				int iComNum[] = randomNum(rand);
				int strike=0, ball = 0;
				while(strike != 3)
				{
					for(int k : iComNum)
					{
						System.out.print(k+" ");
					}
					System.out.println();
					strike = 0;
					ball = 0;
					int iUserNum[] = userNum(sc);					
					if(!(iUserNum[0]==iUserNum[1]||iUserNum[1]==iUserNum[2]||iUserNum[2]==iUserNum[0]))
					{
						strike = judge(iComNum, iUserNum)[0];
						result(judge(iComNum, iUserNum));
					}
					else
					{
						err();
					}
				}
			}
			else
			{
				err();
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		start(sc, rand);
		sc.close();
	}

}
