package Day10;

import java.util.Scanner;

public class Q24 
{
	public static int inputRow(Scanner sc)
	{
		output("예약하실 행의 위치를 입력해주세요: ");
		int row = sc.nextInt();
		return row;
	}
	
	public static int inputCol(Scanner sc)
	{
		output("예약하실 열의 위치를 입력해주세요: ");
		int col = sc.nextInt();
		return col;
	}
	
	public static void outputln(String str)
	{
		System.out.println(str);
	}
	
	public static void output(String str)
	{
		System.out.print(str);
	}
	
	public static void emptyslot(boolean[][] isReserved)
	{
		for(int i=0; i<isReserved.length; i++)
		{
			for(int j=0; j<isReserved[i].length; j++)
			{
				if(isReserved[i][j]==false)
				{
					output((i+1)+"-"+(j+1)+" ");
				}
			}
		}
	}
	
	public static void start(Scanner sc)
	{
		int reservCount = 0;
		boolean isReserved[][] = new boolean[9][2];
		while(reservCount != 18)
		{
			outputln("입력가능 범위 : 1-1 ~ 9-2");
			int row = inputRow(sc);
			int col = inputCol(sc);
			if(row < 1 || row > isReserved.length || col < 1 || col > isReserved[0].length)
			{
				outputln("Error: 잘못된 입력입니다.");
			}
			else
			{
				if(isReserved[row-1][col-1]==true)
				{
					outputln("이미 예약된 자리입니다.\n다시 예약해주세요.");
					output("비어있는 좌석은 ");
					emptyslot(isReserved);
					outputln("입니다.");
				}
				else
				{
					isReserved[row-1][col-1] = true;
					outputln("예약이 완료되었습니다.");
					reservCount++;
				}
				if(reservCount == 18)
				{
					outputln("예약이 끝났습니다.");
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		//14번 문제의 함수화 (비행기 예약 시스템)
		Scanner sc = new Scanner(System.in);
		start(sc);
		sc.close();
	}

}
