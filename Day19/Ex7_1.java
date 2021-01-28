package Day19;

import java.util.Vector;

public class Ex7_1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); // 정수값만 다루는 벡터 생성
		v.add(5); // 5 삽입
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입

		// 백터 중간에 삽입하기
		v.add(2, 100); // index 2번째에 100을 삽입 후 기존 index 2번째 이후에 있는 요소들을
		// 한칸씩 뒤로 옮김
		System.out.println("벡터 내의 요소 객체 수 : " + v.size());
		System.out.println("벡터의 현재 용량 : " + v.capacity());

		for (int i = 0; i < v.size(); i++) // 모든 정수 요소 출력
		{
			System.out.println(v.get(i) + " ");
		}
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			sum += v.elementAt(i);
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
