package Day6;

import java.util.Random;
import java.util.Scanner;

public class Q12 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		boolean bCheckExit = true;
		while(bCheckExit)
		{
			System.out.println("---Select---");
			System.out.println("1.종료");
			System.out.println("2.숫자야구게임시작");
			int input1 = sc.nextInt();
			if(input1 == 1)
			{
				System.out.println("프로그램을 종료합니다.");
				bCheckExit = false;
			}
			else if(input1 == 2)
			{
				int iComNum[] = new int[3];
				int strike=0, ball=0;
				for(int k=0; k<3; k++)
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
				while(strike != 3)
				{
					strike = 0;
					ball = 0;
					int iUserNum[] = new int[3];
					for(int i=0; i<3; i++)
					{
						System.out.printf("%d번째 숫자를 입력하세요 : ",i+1);
						iUserNum[i] = sc.nextInt();
					}
					for(int i=0; i<3; i++)
					{
						if(iUserNum[i] == iComNum[i])
						{
							strike++;
						}
					}
					if(iUserNum[0] == iComNum[1] || iUserNum[0] == iComNum[2])
					{
						ball++;
					}
					if(iUserNum[1] == iComNum[0] || iUserNum[1] == iComNum[2])
					{
						ball++;
					}
					if(iUserNum[2] == iComNum[0] || iUserNum[2] == iComNum[1])
					{
						ball++;
					}
					if(strike == 3)
					{
						System.out.println("홈런입니다!");
					}
					else if(strike == 0 && ball == 0)
					{
						System.out.println("아웃입니다.");
					}
					else
					{
						System.out.println(strike+"스트라이크, "+ball+"볼 입니다.");
					}
				}
			}
			else
			{
				System.out.println("Error: 잘못된 입력입니다.");
			}
		}
		sc.close();
	}

}
