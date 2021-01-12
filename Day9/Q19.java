package Day9;

import java.util.Random;

public class Q19 
{
	
	public static int randValue()
	{
		Random rd = new Random();
		int value = rd.nextInt(26);
		return value;
	}
	
	public static int plus(int a, int val)
	{
		return a+val;
	}
	
	public static String charlize(int val)
	{
		String str = (char)val+"";
		return str;
	}
	
	public static String charPlus(int X)
	{
		String str = "";
		for(int i=0; i<X; i++)
		{
			String temp = charlize(plus(65,randValue()));
			str += temp;
		}
		return str;
	}
	
	public static void charPrint(String str)
	{
		for(int i = 0; i<str.length(); i++)
		{
			System.out.print(str.charAt(i) + " ");
		}
	}
	
	public static void runXTime(int X)
	{
		String str = "";
		str = charPlus(X);
		charPrint(str);
	}

	public static void main(String[] args) 
	{
		runXTime(10);
	}

}
