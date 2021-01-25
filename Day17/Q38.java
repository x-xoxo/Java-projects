package Day17;
class Dinosour {
	private double m,t;
	
	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public void prt()
	{
		System.out.println("나는 키 "+getM()+"m 몸무게 "+getT()+"톤인 공룡이다.");
	}
}
class Tirano extends Dinosour {
	Tirano()
	{
		setM(2);
		setT(1);
	}
	public void prt()
	{
		System.out.println("나는 키 "+getM()+"m 몸무게 "+getT()+"톤인 티라노사우르스다.");
	}
}
class Tricara extends Dinosour {
	Tricara()
	{
		setM(3);
		setT(2);
	}
	public void prt()
	{
		System.out.println("나는 키 "+getM()+"m 몸무게 "+getT()+"톤인 트리케라톱스다.");
	}
}
class Boogyung extends Dinosour {
	Boogyung()
	{
		setM(5);
		setT(3);
	}
	public void prt()
	{
		System.out.println("나는 키 "+getM()+"m 몸무게 "+getT()+"톤인 부경사우르스다.");
	}
}

public class Q38 {
	static void shout(Dinosour dino)
	{
		dino.prt();
	}

	public static void main(String[] args) {
		shout(new Boogyung());
		shout(new Tirano());
		shout(new Tricara());
	}

}
