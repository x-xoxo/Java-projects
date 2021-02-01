package Day20;

import java.io.*;
import java.util.*;

public class Q42 {

	public static void main(String[] args) throws IOException {
		Controller c = new Controller();
		File f = new File("c:/Temp/telBook.txt");
		if (f.exists()) {
			c.telBook.clear();
			BufferedReader bufr = new BufferedReader(new FileReader(f));
			String line;
			String splitLine[] = null;
			while ((line = bufr.readLine()) != null) {
				splitLine = line.split("\t\t");
				c.telBook.add(new PersonInfo(splitLine[0], splitLine[1], splitLine[2], splitLine[3]));
			}
			bufr.close();
		} else
			f.createNewFile();
		while (true) {
			Scanner sc = new Scanner(System.in);
			FileWriter fw = null;
			System.out.print("1.입력 2.검색 3.전체출력 4.삭제	5.종료 >");
			int num = sc.nextInt();
			if (c.telBook.size() == 0) {
				fw = new FileWriter(f, false);
			} else {
				fw = new FileWriter(f, true);
			}
			switch (num) {
			case 1:
				c.input(fw);
				break;
			case 2:
				c.search();
				break;
			case 3:
				c.prtAll(f);
				break;
			case 4:
				FileWriter fw1 = new FileWriter(f, false);
				c.delete(fw1);
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
			if (num == 5)
				break;
			sc.close();
		}
	}

}

class PersonInfo {
	private String name, number, adress, gender;

	PersonInfo(String name, String number, String adress, String gender) {
		setName(name);
		setNumber(number);
		setAdress(adress);
		setGender(gender);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String toString() {
		return getName() + ", " + getNumber() + ", " + getAdress() + ", " + getGender();
	}
}

class Controller {
	ArrayList<PersonInfo> telBook;
	Scanner sc;
	FileReader fr;
	FileWriter fw;

	public Controller() throws IOException {
		telBook = new ArrayList<PersonInfo>();
		sc = new Scanner(System.in);
	}

	void input(FileWriter fw) throws IOException {
		if (telBook.size() == 0) {
			String Infotypes = "이름\t\t전화번호\t\t주소\t\t성별\r\n";
			telBook.add(new PersonInfo("이름", "전화번호", "주소", "성별"));
			fw.write(Infotypes);
		}
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 : ");
		String number = sc.nextLine();
		System.out.print("주소 : ");
		String adress = sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();

		telBook.add(new PersonInfo(name, number, adress, gender));
		String total = name + "\t\t" + number + "\t\t" + adress + "\t\t" + gender + "\r\n";
		fw.write(total);
		fw.close();
	}

	void search() {
		System.out.print("검색할 이름 입력 : ");
		String findname = sc.nextLine();
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < telBook.size(); i++) {
			if (telBook.get(i).getName().equals(findname)) {
				index = i;
				flag = true;
			}
		}
		if (flag) {
			System.out.println(telBook.get(index));
		} else {
			System.out.println("이름이 존재하지 않습니다.");
		}
	}

	void delete(FileWriter fw) throws IOException {
		System.out.println("검색할 이름 입력 : ");
		String findname = sc.nextLine();
		boolean flag = false;
		int index = -1;
		for (int i = 0; i < telBook.size(); i++) {
			if (telBook.get(i).getName().equals(findname)) {
				index = i;
				flag = true;
				break;
			}
		}
		if (flag) {
			telBook.remove(index);
			System.out.println("삭제 완료.");
		}
		for (int i = 0; i < telBook.size(); i++) {
			String total = telBook.get(i).getName() + "\t\t" + telBook.get(i).getNumber() + "\t\t" + telBook.get(i).getAdress() + "\t\t" + telBook.get(i).getGender() + "\r\n";
			fw.write(total);
		}
		fw.close();
	}

	void prtAll(File f) throws IOException {
		telBook.clear();
		BufferedReader bufr = new BufferedReader(new FileReader(f));
		String line;
		String splitLine[] = null;

		while ((line = bufr.readLine()) != null) {
			splitLine = line.split("\t\t");
			telBook.add(new PersonInfo(splitLine[0], splitLine[1], splitLine[2], splitLine[3]));
		}
		for (int i = 0; i < telBook.size(); i++) {
			System.out.println(telBook.get(i).getName() + "\t\t" + telBook.get(i).getNumber() + "\t\t" + telBook.get(i).getAdress() + "\t\t" + telBook.get(i).getGender());
		}
		bufr.close();
	}
}