package Day5;

import java.util.Scanner;

public class Q9
{

	public static void main(String[] args)
	{
		boolean bCheckExit = true;
		boolean bSigned = false;
		Scanner sc = new Scanner(System.in);
		String sIdSaved = "NULL", sPassWordSaved = "NULL";
		while(bCheckExit)
		{
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.종료");
			int input_first = sc.nextInt();
			switch (input_first)
			{
			case 1:
				System.out.println("-----회원가입-----");
				System.out.print("ID: ");
				sIdSaved = sc.next();
				System.out.print("PassWord: ");
				sPassWordSaved = sc.next();
				System.out.println("회원가입이 완료되었습니다.");
				bSigned = true;
				break;
			case 2:
				System.out.println("-----로그인-----");
				System.out.print("ID: ");
				String sIdLogin = sc.next();
				System.out.print("PassWord: ");
				String sPwLogin = sc.next();
				if(!bSigned)
				{
					System.out.println("회원가입이 되지않았습니다.");
					System.out.println();
					System.out.println("-----회원가입-----");
					System.out.print("ID: ");
					sIdSaved = sc.next();
					System.out.print("PassWord: ");
					sPassWordSaved = sc.next();
					System.out.println("회원가입이 완료되었습니다.");
					System.out.println();
					bSigned = true;
				}
				else if (sIdLogin.equals(sIdSaved) && sPwLogin.equals(sPassWordSaved))
				{
					System.out.println(sIdLogin+"님 환영합니다!");
					System.out.println();
				}
				else
				{
					System.out.println("ID와 PW가 틀립니다.");
				}
				break;
			case 3:
				System.out.println("안녕히 가세요.\n\n프로그램을 종료합니다...");
				bCheckExit = false;
				break;
			default:
				System.out.println("입력이 잘못되었습니다.\n");
				break;
			}
		}
		sc.close();
	}

}
