package Day5;

import java.util.Scanner;

import java.util.Random;

public class Q8 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int input = 0;
		while(input != 2)
		{
			System.out.println("『가위바위보 게임』");
			System.out.print("1.게임시작\n2.종료\n");
			System.out.print("------------------\n:");
			input = sc.nextInt();
			if(input < 1 || input > 2)
			{
				System.out.println("Error: 잘못된 입력입니다.");
			}
			else
			{
				switch (input)
				{
				case 1:
					System.out.print("1.가위 2.바위 3.보 중 하나를 선택해주세요: ");
					int userInput = sc.nextInt();
					if(userInput < 1 || userInput > 3)
					{
						System.out.println("Error: 잘못된 입력입니다.");
					}
					else
					{
						int aiOutput = rd.nextInt(3)+1;
						if(userInput == 1) // 가위를 선택한 경우
						{
							if(aiOutput == 1)
							{
								System.out.println("무승부 , 비겼습니다.");
							}
							else if(aiOutput == 2)
							{
								System.out.println("게임결과: User 패");
							}
							else if(aiOutput == 3)
							{
								System.out.println("게임결과: User 승");
							}
							else
							{
								System.out.println("Error: 알수없는 오류");
							}
						}
						else if(userInput == 2) // 바위를 선택한 경우
						{
							if(aiOutput == 1)
							{
								System.out.println("게임결과: User 승");
							}
							else if(aiOutput == 2)
							{
								System.out.println("무승부 , 비겼습니다.");
							}
							else if(aiOutput == 3)
							{
								System.out.println("게임결과: User 패");
							}
							else
							{
								System.out.println("Error: 알수없는 오류");
							}
						}
						else // 보자기를 선택한 경우
						{
							if(aiOutput == 1)
							{
								System.out.println("게임결과: User 패");
							}
							else if(aiOutput == 2)
							{
								System.out.println("게임결과: User 승");
							}
							else if(aiOutput == 3)
							{
								System.out.println("무승부 , 비겼습니다.");
							}
							else
							{
								System.out.println("Error: 알수없는 오류");
							}
						}
					}
					break;
				case 2:
					System.out.println("프로그램을 종료합니다...");
					break;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}
			}
		}
		sc.close();
	}

}
