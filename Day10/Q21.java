package Day10;

import java.util.Scanner;

public class Q21 
{

	public static void err()
	{
		System.out.println("Error: 잘못 입력하였습니다.");
	}

	public static void printMulTable(int num)
	{
		System.out.println("----------------------------------");
		for (int i = 1; i < 10; i++) 
		{
			System.out.println(num + "X" + i + "=" + (num * i));
		}
	}

	public static int inputdan(Scanner sc)
	{
		System.out.print("출력하기 원하는 단을 입력하세요 : ");
		int mulTableNum = sc.nextInt(); // 정수 입력 받아 mulTableNum 에 대입
		return mulTableNum;
	}

	public static void selectMul(int num)
	{
		if (num < 2 || num > 9) // 입력한 단이 2~9 가 아닐경우 에러 메시지
		{
			err();
		} 
		else // 입력한 단이 2~9일 경우 입력한 단 출력
		{
			printMulTable(num);
		}
	}

	public static void allMul()
	{
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
	}

	public static int inputSelect(Scanner sc)
	{
		System.out.println("1.원하는 구구단 출력");
		System.out.println("2.전체 구구단 출력");
		return sc.nextInt(); // 정수 입력받기
	}

	public static void mulTable(Scanner sc)
	{
		switch (inputSelect(sc)) // 입력받은 정수에 대한 분기
		{
		case 1:
			selectMul(inputdan(sc));
			break;
		case 2:
			allMul();
			break;
		default:
			err();
			break;
		}
	}

	public static void nemo()
	{
		for (int i=0; i<5; i++)
		{
			for(int o=0; o<5; o++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void samgak()
	{
		for (int i=1; i<=5; i++)
		{
			for(int o=1; o<=i; o++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void samgak2()
	{
		for (int i=0; i<5; i++)
		{
			for(int o=4; o>=0; o--)
			{
				if(i<o)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void pyramid()
	{
		for (int i=0; i<5; i++)
		{
			for (int x=0; x<4-i; x++)
			{
				System.out.print(" ");
			}
			for (int y=0; y<2*i+1; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void dia()
	{
		for (int i=0; i<5; i++)
		{
			if (i<3)
			{
				for (int y=0; y<2-i;y++)
				{
					System.out.print(" ");
				}
				for (int z=0; z<2*i+1; z++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			else
			{
				for (int z=0; z<i-2;z++)
				{
					System.out.print(" ");
				}
				for (int y=6; y>i*2-3; y--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

	public static int inputSelect2(Scanner sc)
	{
		System.out.println("1.네모 2.직삼각형 정방향 3.직삼각형 역방향 4.피라미드 5.다이아몬드");
		return sc.nextInt();
	}

	public static void shape(Scanner sc)
	{
		switch (inputSelect2(sc)) 
		{
		case 1:
			nemo();
			break;
		case 2:
			samgak();
			break;
		case 3:
			samgak2();
			break;
		case 4:
			pyramid();
			break;
		case 5:
			dia();
			break;
		default:
			err();
			break;
		}
	}

	public static void exMsg()
	{
		System.out.println("프로그램을 종료합니다.");
	}

	public static int firstInput(Scanner sc)
	{
		System.out.println("1.구구단 출력\n2.별찍기 출력\n3.종료");
		return sc.nextInt();
	}

	public static void initSelect(int input, Scanner sc)
	{
		switch (input) 
		{
		case 1:
			mulTable(sc);
			break;
		case 2:
			shape(sc);
			break;
		case 3:
			exMsg();
			break;
		default:
			err();
			break;
		}
	}

	public static void project(Scanner sc)
	{
		int initInput = 0;
		while(initInput != 3)
		{
			initInput = firstInput(sc);
			switch (initInput) 
			{
			case 1:
				mulTable(sc);
				break;
			case 2:
				shape(sc);
				break;
			case 3:
				exMsg();
				break;
			default:
				err();
				break;
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		project(sc);
	}

}
