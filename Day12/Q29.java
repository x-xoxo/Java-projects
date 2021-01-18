package Day12;

import java.util.Random;
import java.util.Scanner;

public class Q29 
{

	public static void main(String[] args) 
	{
		final int 가위 = 1, 바위 = 2, 보 = 3;
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		Win win = new Win();
		Draw dr = new Draw();
		Lose los = new Lose();
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
					win.user = dr.user = los.user = userInput;
					if(userInput < 1 || userInput > 3)
					{
						System.out.println("Error: 잘못된 입력입니다.");
					}
					else
					{
						int aiOutput = rd.nextInt(3)+1;
						win.com = dr.com = los.com = aiOutput;
						if(userInput == 가위) // 가위를 선택한 경우
						{
							if(aiOutput == 가위)
							{
								dr.draw();
							}
							else if(aiOutput == 바위)
							{
								los.user();
							}
							else if(aiOutput == 보)
							{
								win.user();
							}
							else
							{
								System.out.println("Error: 알수없는 오류");
							}
						}
						else if(userInput == 바위) // 바위를 선택한 경우
						{
							if(aiOutput == 가위)
							{
								win.user();
							}
							else if(aiOutput == 바위)
							{
								dr.draw();
							}
							else if(aiOutput == 보)
							{
								los.user();
							}
							else
							{
								System.out.println("Error: 알수없는 오류");
							}
						}
						else // 보자기를 선택한 경우
						{
							if(aiOutput == 가위)
							{
								los.user();
							}
							else if(aiOutput == 바위)
							{
								win.user();
							}
							else if(aiOutput == 보)
							{
								dr.draw();
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
class Win
{
	int com,user;
	public void user()
	{
		String ComRSP = com==1?"가위":com==2?"바위":"보";
		String UserRSP = user==1?"가위":user==2?"바위":"보";
		System.out.println("User: "+UserRSP+" Com: "+ComRSP+" User 승");
	}
	public void com()
	{
		String ComRSP = com==1?"가위":com==2?"바위":"보";
		String UserRSP = user==1?"가위":user==2?"바위":"보";
		System.out.println("User: "+UserRSP+" Com: "+ComRSP+" Com 승");
	}
}

class Draw
{
	int com,user;
	public void draw()
	{
		String ComRSP = com==1?"가위":com==2?"바위":"보";
		String UserRSP = user==1?"가위":user==2?"바위":"보";
		System.out.println("User: "+UserRSP+" Com: "+ComRSP+" 무승부");
	}
}

class Lose
{
	int com,user;
	public void user()
	{
		String ComRSP = com==1?"가위":com==2?"바위":"보";
		String UserRSP = user==1?"가위":user==2?"바위":"보";
		System.out.println("User: "+UserRSP+" Com: "+ComRSP+" User 패");
	}
	public void com()
	{
		String ComRSP = com==1?"가위":com==2?"바위":"보";
		String UserRSP = user==1?"가위":user==2?"바위":"보";
		System.out.println("User: "+UserRSP+" Com: "+ComRSP+" Com 패");
	}
}