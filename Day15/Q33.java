package Day15;

import java.util.Random;

class Box {
	String stuff = "물건";
}

class Monkey {
	Box obj;
	String color = "";

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	void prt()
	{
		if(this.obj!=null)
			System.out.println(color+"원숭이가 물건을 가지고 있습니다.");
		else
			System.out.println(color+"원숭이가 물건을 가지고 있지 않습니다.");
	}
}
class Control {
	Monkey mk[] = new Monkey[5];
	Box obj = new Box();
	Random r = new Random();
	void run()
	{
		for(int i=0;i<mk.length;i++)
		{
			mk[i] = new Monkey();
			if(i==0)
			{
				mk[i].setColor("빨간");
			}
			else if(i==1)
			{
				mk[i].setColor("노랑");
			}
			else if(i==2)
			{
				mk[i].setColor("파랑");
			}
			else if(i==3)
			{
				mk[i].setColor("초록");
			}
			else
			{
				mk[i].setColor("검정");
			}
		}
		int LR = r.nextInt(2);
		int num = r.nextInt(5)+1;
		System.out.println(LR + " / " + num);
		mk[0].obj = obj;
		obj = null;
		if(LR == 0)
		{
			for(int i=0;i<num;i++)
			{
				if(i==0)
				{
					mk[4].obj = mk[i].obj;
					mk[i].obj = null;
					mk[4].prt();
				}
				else
				{
					mk[4-i].obj = mk[5-i].obj;
					mk[5-i].obj = null;
					mk[4-i].prt();
				}
			}
		}
		else
		{
			for(int i=0;i<num;i++)
			{
				if(i==4)
				{
					mk[0].obj = mk[i].obj;
					mk[i].obj = null;
					mk[0].prt();
				}
				else
				{
					mk[i+1].obj = mk[i].obj;
					mk[i].obj = null;
					mk[i+1].prt();
				}
			}
		}

	}
}

public class Q33 {

	public static void main(String[] args) {
		new Control().run();
	}

}
