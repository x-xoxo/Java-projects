package Day19;

import java.util.Vector;

class Point {
	private int x,y;
	public Point(int x,int y)
	{
		this.x = x; this.y = y;
	}
	public String toString()
	{
		return "("+x+","+y+")";
	}
}

public class Ex7_2 {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<Point>();
		
		v.add(new Point(2,3)); // index 0
		v.add(new Point(-5,20)); //index 1
		v.add(new Point(30,-8)); //index 2
		v.remove(1); // 인덱스 1 의 객체 삭제
		for(int i=0;i<v.size();i++)
		{
			Point p = v.get(i);
			System.out.println(p);
		}
	}

}
