package Day17;

import java.util.Scanner;

class Control {
	Scanner sc = new Scanner(System.in);
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a, double b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
	double sub(double a, double b)
	{
		return a-b;
	}
	int mul(int a, int b)
	{
		return a*b;
	}
	double mul(double a, double b)
	{
		return a*b;
	}
	double div(int a,int b)
	{
		return a/(b*1.0);
	}
	double div(double a,double b)
	{
		return a/b;
	}
	String inputnum1()
	{
		System.out.print("숫자1 입력: ");
		return sc.next();
	}
	String inputnum2()
	{
		System.out.print("숫자2 입력: ");
		return sc.next();
	}
	int selectExit()
	{
		System.out.print("1.연산 2.종료 >> ");
		return sc.nextInt();
	}
	int selectOp()
	{
		System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기 >> ");
		return sc.nextInt();
	}
	void prtResult(int result)
	{
		System.out.println("결과 값: "+result);
	}
	void prtResult(double result)
	{
		System.out.println("결과 값: "+result);
	}
}

public class Q37 {

	public static void main(String[] args) {
		Control ctrl = new Control();
		while(true)
		{
			int select1 = ctrl.selectExit();
			if(select1 == 2)
			{
				break;
			}
			else if (select1 == 1)
			{
				int select2 = ctrl.selectOp();
				if(select2==1)
				{
					ctrl.prtResult(ctrl.add(Double.parseDouble(ctrl.inputnum1()),Double.parseDouble(ctrl.inputnum2())));
				}
				else if(select2==2)
				{
					ctrl.prtResult(ctrl.sub(Double.parseDouble(ctrl.inputnum1()), Double.parseDouble(ctrl.inputnum2())));
				}
				else if(select2==3)
				{
					ctrl.prtResult(ctrl.mul(Double.parseDouble(ctrl.inputnum1()), Double.parseDouble(ctrl.inputnum2())));
				}
				else if(select2==4)
				{
					ctrl.prtResult(ctrl.div(Double.parseDouble(ctrl.inputnum1()), Double.parseDouble(ctrl.inputnum2())));
				}
				else
					System.out.println("잘못된 입력입니다.");
			}
			else
				System.out.println("잘못된 입력입니다.");
		}

	}

}
