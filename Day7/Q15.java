package Day7;

public class Q15 
{

	public static void main(String[] args) 
	{
//		Q.15-1
		System.out.println("Q.15-1\n");
		int a[][] = new int[5][5];
		int sum = 1;
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j] = sum;
				sum++;
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------- Q.15-2"); // Q.15-2
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i].length-1; k++) // 인덱스 최댓값에서 +1 하면 오류나니까 -1까지
				{
					if((i+3)%2==0)
					{
						if(a[i][k]<a[i][k+1]) // 내림차순 (큰 수 부터 정렬) 부등호 반대일 경우 오름차순
						{
							int temp = a[i][k+1];
							a[i][k+1] = a[i][k];
							a[i][k] = temp;
						}
					}
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("----------------------------------- Q.15-2 스위치방식"); // Q.15-2 스위치 방식
		int[][] array = new int[5][5];
		int R, C, TR, START, END, SW, K;
		TR = 0;
		START = 0;
		END=array.length-1;
		SW=1; 
		K=0;
		for(R=0;R!=array.length;R++)
		{
			for(C=START; C!=(END+SW); C+=SW)
			{
				K++;
				array[R][C] = K;
			}
			TR = START;
			START = END;
			END = TR;
			SW = SW*(-1);
		}
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.printf("%d\t",array[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------- Q.15-3"); // Q.15-3
		int arr[][] = new int[5][5];
		sum = 1;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j] = sum;
				sum++;
			}
		}
//		int c[][][] = new int[3][2][2];  // 다차원 배열의 for each 사용법
//		for(int [][]k : c)
//		{
//			for(int []j : k)
//			{
//				for(int i : j)
//				{
//					System.out.println(i + " ");
//				}
//			}
//		}
		int[][] arr2 = new int[5][5];

		for (int i=0; i<arr2.length; i++) 
		{
			for (int j=arr2.length-1; j>=0; j--) 
			{
				arr2[i][4 - j] = arr[j][i];
			}
		}
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				System.out.printf("%d\t",arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------- Q.15-4"); // 달팽이
		int[][] arr3 = new int[5][5];
		int x=0;
		int y=-1;
		int repeat=arr3.length;
		int sw=1;
		int n=1;
		
		while(true)
		{
			//열 (Y축)
			for(int i=0; i<repeat; i++)
			{
				y+=sw;
				arr3[x][y]=n++;
			}
			repeat--;
			if(repeat == 0)
				break;
			//행 (X축)
			for(int j=0;j<repeat;j++)
			{
				x+=sw;
				arr3[x][y] = n++;
			}
			sw*=-1;
		}
		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<arr3[i].length; j++)
			{
				System.out.printf("%d\t",arr3[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------- Q.15-5"); // 마방진
		int arr4[][] = new int[5][5];
		int len = arr4.length;
		int row = 0,col = 2;
		int addnum = 1;
		while(addnum!=len*len+1)
		{
			arr4[row][col] = addnum;
			
			int newrow = row-1;
			int newcol = col+1;
			
			if(newrow==-1)
			{
				newrow = 4;
			}
			if(newcol==5)
			{
				newcol = 0;
			}
			if(arr4[newrow][newcol]==0)
			{
				row = newrow;
				col = newcol;
			}
			else
			{
				row = row+1;
			}
			addnum++;
		}
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len; j++)
			{
				System.out.printf("%d\t",arr4[i][j]);
			}
			System.out.println();
		}
		System.out.println("----------------------------------- Q.15-5"); // 마방진 7X7
		int arr5[][] = new int[7][7];
		int len2 = arr5.length;
		int row2 = 0,col2 = 3;
		int addnum2 = 1;
		while(addnum2!=len2*len2+1)
		{
			arr5[row2][col2] = addnum2;
			if(addnum2%7==0)
			{
				row2++;
			}
			else
			{
				row2--;
				col2++;
			}
			addnum2++;
			if(col2==7)
			{
				col2 -= len2;
			}
			if(row2==-1)
			{
				row2 += len2;
			}
		}
		for(int i=0; i<len2; i++)
		{
			for(int j=0; j<len2; j++)
			{
				System.out.printf("%d\t",arr5[i][j]);
			}
			System.out.println();
		}
		
	}

}
