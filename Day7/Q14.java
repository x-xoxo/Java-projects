package Day7;

import java.util.Scanner;

public class Q14 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int reservCount = 0;
		boolean isReserved[][] = new boolean[9][2];
		while(reservCount != 18)
		{
			System.out.print("예약하실 행의 위치를 입력해주세요: ");
			int row = sc.nextInt();
			System.out.print("예약하실 열의 위치를 입력해주세요: ");
			int col = sc.nextInt();
			if(row < 1 || row > isReserved.length || col < 1 || col > isReserved[0].length)
			{
				System.out.println("Error: 잘못된 입력입니다.");
			}
			else
			{
				if(isReserved[row-1][col-1]==true)
				{
					System.out.println("이미 예약된 자리입니다.\n다시 예약해주세요.");
					System.out.print("비어있는 좌석은 ");
					for(int i=0; i<isReserved.length; i++)
					{
						for(int j=0; j<isReserved[i].length; j++)
						{
							if(isReserved[i][j]==false)
							{
								System.out.print((i+1)+"-"+(j+1)+" ");
							}
						}
					}
					System.out.println("입니다.");
				}
				else
				{
					isReserved[row-1][col-1] = true;
					System.out.println("예약이 완료되었습니다.");
					reservCount++;
				}
				if(reservCount == 18)
				{
					System.out.println("예약이 끝났습니다.");
				}
			}
		}
		sc.close();
	}

}
