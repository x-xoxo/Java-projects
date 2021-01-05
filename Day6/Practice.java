package Day6;

// import java.util.Scanner;

enum Week { 월, 화, 수, 목, 금, 토, 일 }

public class Practice 
{

	public static void main(String[] args) 
	{
		// practice 3-7
		/*
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		System.out.println("양수를 5개 입력하세요.");
		for(int i=0; i<5; i++)
		{
			intArray[i] = sc.nextInt();
			if(intArray[i]>max)
			{
				max= intArray[i];
			}
			if(intArray[i] == int)
		}
		System.out.print("가장 큰 수는 "+max+" 입니다.");
		sc.close();
		*/
		// practice 3-8
		/*
		Scanner sc = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int sum = 0;
		
		System.out.print(intArray.length + "개의 정수를 입력하세요>> ");
		for(int i=0; i<intArray.length; i++)
		{
			intArray[i] = sc.nextInt();
		}
		for(int i=0; i<intArray.length; i++)
		{
			System.out.print(intArray[i] + ", ");
		}
		for(int i=0; i<intArray.length; i++)
		{
			sum += intArray[i];
		}
		System.out.print("평균은 "+(double)sum/intArray.length);
		sc.close();
		*/
		// practice 3-9
		int n[] = {1,2,3,4,5};
		String names[] = {"사과","배","바나나","체리","딸기","포도"};
		
		int sum = 0;
		for(int k : n)
		{
			System.out.print(k + " ");
			sum += k;
		}
		System.out.println("합은 "+sum);
		
		for(String s : names)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		for(Week day : Week.values())
		{
			System.out.print(day+"요일 ");
		}
		System.out.println();
	}

}
