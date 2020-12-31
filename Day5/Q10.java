package Day5;

import java.util.Scanner;

import java.util.Random;

public class Q10 
{

	public static void main(String[] args)
	{
//		Q.10-1 숫자야구게임
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int iComNum1 = 0, iComNum2 = 0, iComNum3 = 0; // 컴퓨터가 정하는 임의값의 변수 선언
		boolean bExitCheck = true; // 종료트리거 선언
		while(bExitCheck) // 종료 트리거 false 될때 까지 무한루프
		{
			System.out.println("---숫자야구게임---");
			System.out.println("1. Q.10-1");
			System.out.println("2. Q.10-2");
			int iSelectNum = sc.nextInt();
			switch (iSelectNum)
			{
			case 1:                            // 1번을 눌럿을 경우
				iComNum1 = rand.nextInt(9)+1;
				iComNum2 = rand.nextInt(9)+1;
				iComNum3 = rand.nextInt(9)+1;  // 랜덤값 3개 생성
				if(iComNum1 == iComNum2) // 랜덤값1과 2가 같은 경우
				{
					while(iComNum1 == iComNum2) // 랜덤값 1과 2가 다를때까지 2에 랜덤 값 생성
					{
						iComNum2 = rand.nextInt(9)+1;
					}
				}
				if(iComNum2 == iComNum3) // 랜덤값 2와 3이 같은 경우
				{
					while(iComNum2 == iComNum3) // 랜덤값 2와 3이 다를 때까지 3에 랜덤값 생성
					{
						iComNum3 = rand.nextInt(9)+1;
					}
				}
				System.out.print("첫번째 숫자를 입력해주세요: ");
				int iNum1 = sc.nextInt();
				switch (iNum1) 
				{
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
					System.out.print("두번째 숫자를 입력해주세요: ");
					int iNum2 = sc.nextInt();
					switch (iNum2) 
					{
					case 1:
					case 2:
					case 3:
					case 4:
					case 5:
					case 6:
					case 7:
					case 8:
					case 9:
						System.out.print("세번째 숫자를 입력해주세요: ");
						int iNum3 = sc.nextInt();
						switch (iNum3)
						{
						case 1:
						case 2:
						case 3:
						case 4:
						case 5:
						case 6:
						case 7:
						case 8:
						case 9:
							if(iNum1!=iComNum1||iNum1!=iComNum2||iNum1!=iComNum3) // 여기부터 하기
							break;

						default:
							System.out.println("Error: 잘못된 입력입니다.");
							break;
						}
						break;

					default:
						System.out.println("Error: 잘못된 입력입니다.");
						break;
					}
					break;

				default:
					System.out.println("Error: 잘못된 입력입니다.");
					break;
				}
				break;
			case 2:
				
				break;
			default:
				System.out.println("Error: 잘못된 입력입니다.\n");
				break;
			}
		}
	}

}
