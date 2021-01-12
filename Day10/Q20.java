package Day10;

import java.util.Scanner;

public class Q20 
{
	
	public static String inputString()
	{
		System.out.print("문자열을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		return sc.next();
	}
	
	public static int chooseOddEven()
	{
		System.out.println("1. 홀수 2. 짝수");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	public static void err()
	{
		System.out.println("잘못된 입력입니다.");
	}
	
	public static void print(String str)
	{
		System.out.println(str);
	}
	
	public static String oddCal(String str)
	{
		String strtemp = "";
		for(int i=0; i<str.length();i++)
		{
			if(i%2!=0)
			{
				strtemp += str.charAt(i);
			}
		}
		return strtemp;
	}
	
	public static String evenCal(String str)
	{
		String strtemp = "";
		for(int i=0; i<str.length();i++)
		{
			if(i%2==0)
			{
				strtemp += str.charAt(i);
			}
		}
		return strtemp;
	}
	
	public static void cal(String str, int num)
	{
		if(num == 1)
		{
			print(oddCal(str));
		}
		else if (num == 2)
		{
			print(evenCal(str));
		}
		else
		{
			err();
		}
	}

	public static void main(String[] args) 
	{
		cal(inputString(),chooseOddEven());
	}

}
