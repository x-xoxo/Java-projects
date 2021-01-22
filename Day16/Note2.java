package Day16;

class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public void setWeight(int weight)
	{
		this.weight = weight;
	}
	public int getWeight()
	{
		return weight;
	}
}

class Student extends Person {
	public void set()
	{
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99;
		setWeight(99);
	}
}

public class Note2 {
	public static void main(String[] args)
	{
		new Student().set();
	}
}
