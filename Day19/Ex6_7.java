package Day19;

public class Ex6_7 {

	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		System.out.println(a + "의 길이는 " + a.length());
		System.out.println(a.contains("#"));

		a = a.concat(b);
		System.out.println("a.concat(b): " + a);

		a = a.trim();
		System.out.println("a.trim(): "+a);

		a = a.replace("C#", "Java");
		System.out.println("a.replace(\"C#\", \"Java\"): "+a);

		String s[] = a.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println("s[] = a.split(\",\") : 분리된 문자열" + i + ": " + s[i]);
		}

		a = a.substring(5);
		System.out.println("a.substring(5): "+a);

		char c = a.charAt(2);
		System.out.println("a.charAt(2): "+c);
	}

}
