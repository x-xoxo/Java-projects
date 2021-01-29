package Day20;

import java.util.*;

class Student {
	private int id;
	private String tel;
	public int getId() {
		return id;
	}
	public String getTel() {
		return tel;
	}
	public Student(int id, String tel)
	{
		this.id = id;
		this.tel = tel;
	}
}

public class Ex7_7 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-222-2222"));
		map.put("김남윤", new Student(3,"010-333-3333"));
		
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.print("검색할 이름 입력 : ");
			String name = sc.nextLine();
			if(name.equals("exit"))
			{
				System.out.println("종료합니다.");
				break;
			}
			Student stdt = map.get(name);
			if(stdt == null)
			{
				System.out.println(name+"는 없는 사람입니다.");
			}
			else
			{
				System.out.println("ID: "+stdt.getId()+", 전화번호: "+stdt.getTel());
			}
		}
		sc.close();
	}

}
