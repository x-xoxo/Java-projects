package Day4;

import java.util.Scanner;

public class test 
{

	public static void main(String[] args) 
	{
		// Q5.
		Scanner sc = new Scanner(System.in);
		boolean inputExit = false; // 종료 트리거 생성
		while (inputExit == false) // 종료 트리거 발생까지 반복
		{
			System.out.println("----------------");
			System.out.println("1.원하는 구구단 출력");
			System.out.println("2.전체 구구단 출력");
			System.out.println("3.종료");
			int inputNum = sc.nextInt(); // 정수 입력받기
			switch (inputNum) // 입력받은 정수에 대한 분기
			{
				case 1:
					System.out.print("출력하기 원하는 단을 입력하세요 : ");
					int mulTableNum = sc.nextInt(); // 정수 입력 받아 mulTableNum 에 대입
					if (mulTableNum < 2 || mulTableNum > 9) // 입력한 단이 2~9 가 아닐경우 에러 메시지
					{
						System.out.println("Error: 잘못 입력하였습니다.");
					} 
					else // 입력한 단이 2~9일 경우 입력한 단 출력
					{
						System.out.println("----------------------------------");
						for (int i = 1; i < 10; i++) 
						{
							System.out.println(mulTableNum + "X" + i + "=" + (mulTableNum * i));
						}
					}
					break;
				case 2:
					System.out.println("----------------------------------");
					for (int i = 1; i < 10; i++) // 2단~5단 까지세로로 출력
					{
						for (int k = 2; k < 6; k++) 
						{
							System.out.print(k + "X" + i + "=" + (k * i) + "\t");
						}
						System.out.println(); 
					}
					System.out.println("----------------------------------");
					for (int i = 1; i < 10; i++) // 6단~9단까지 세로로 출력
					{
						for (int k = 6; k < 10; k++) 
						{
							System.out.print(k + "X" + i + "=" + (k * i) + "\t");
						}
						System.out.println();
					}
					break;
				case 3:
					System.out.println("----------------------------------");
					System.out.println("종료합니다.");
					inputExit = true; // 종료 트리거 발생
					break;
				default:
					System.out.println("----------------------------------");
					System.out.println("Error: 잘못 입력하였습니다.");
					break;
			}
		}
		sc.close();
	}
}
