package Day17;

import java.util.Random;

class Dongmul {
	private String name, color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void introduce()
	{
		System.out.println("나는 동물이다");
	}
}
class Dog extends Dongmul {
	Dog()
	{
		Random r = new Random();
		String colors[] = {"빨간색","주황색","노란색","초록색","파란색","남색","보라색"};
		super.setColor(colors[r.nextInt(7)]);
		super.setName("강아지");
	}
	void introduce() 
	{
		System.out.println("나는 "+super.getColor()+" "+super.getName()+" 입니다.");
	}
}
class Cat extends Dongmul {
	Cat() {
		Random r = new Random();
		String colors[] = {"빨간색","주황색","노란색","초록색","파란색","남색","보라색"};
		super.setColor(colors[r.nextInt(7)]);
		super.setName("고양이");
	}
	void introduce() 
	{
		System.out.println("나는 "+super.getColor()+" "+super.getName()+" 입니다.");
	}
}
class Meerkat extends Dongmul {
	Meerkat() {
		Random r = new Random();
		String colors[] = {"빨간색","주황색","노란색","초록색","파란색","남색","보라색"};
		super.setColor(colors[r.nextInt(7)]);
		super.setName("미어캣");
	}
	void introduce() 
	{
		System.out.println("나는 "+super.getColor()+" "+super.getName()+" 입니다.");
	}
}
class Panda extends Dongmul {
	Panda() {
		Random r = new Random();
		String colors[] = {"빨간색","주황색","노란색","초록색","파란색","남색","보라색"};
		super.setColor(colors[r.nextInt(7)]);
		super.setName("판다");
	}
	void introduce() 
	{
		System.out.println("나는 "+super.getColor()+" "+super.getName()+" 입니다.");
	}
}
class Uri {
	Dongmul d[] = new Dongmul[10];
	Random r = new Random();
	void run()
	{
		for(int i=0;i<d.length;i++)
		{
			int value = r.nextInt(4);
			if(value == 0)
			{
				d[i] = new Dog();
			}
			else if(value == 1)
			{
				d[i] = new Cat();
			}
			else if(value == 2)
			{
				d[i] = new Meerkat();
			}
			else
			{
				d[i] = new Panda();
			}
		}
		for(int i=0;i<d.length;i++)
		{
			d[i].introduce();
		}
	}
}

public class Q39 {

	public static void main(String[] args) {
		new Uri().run();
	}

}
