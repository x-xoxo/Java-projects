package Day8;

public class HelloWorld 
{
	public static String one(String str)
	{
		return str;
	}
	
	public static void two(String name)
	{
		System.out.println("저는"+name+"입니다.");
	}
	
	public static String three()
	{
		return "환영합니다.";
	}
	
	public static void four()
	{
		System.out.println("안녕히가세요.");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//안녕하세요.      1번 주고받고
		//저는 XXX입니다.  2번 안주고 받고
		//환영합니다.      3번 주고 안받고
		//안녕히가세요.	   4번 안주고안받고
		System.out.println(one("안녕하세요"));
		two("한국");
		System.out.println(three());
		four();
	}

}
