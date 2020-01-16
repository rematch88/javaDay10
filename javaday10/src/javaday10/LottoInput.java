package javaday10;

import java.util.Scanner;
import java.util.TreeSet;

public class LottoInput {

	public static void main(String[] args) {
		// 1-45까지의 정수를 저장할 자료구조를 생성
		TreeSet<Integer> lotto = new TreeSet<Integer>();

		// 키보드로부터 입력받기 위한 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		while (lotto.size() < 6) {
			try {
				System.out.print("1-45까지의 중복되지 않은 숫자:");
				// 문자를 입력해서 예외가 발생하면 catch 구문이 동작하고 그러면 반복문의 시작부분으로 돌아가서 수행
				int su = sc.nextInt();

				// 1부터 45사이의 숫자인지 검사
				if (su < 1 || su > 45) {
					System.out.println("1-45 사이의 숫자만 입력하세요 !!!");
					continue;
				}

				// 입력받은 숫자를 set에 추가
				boolean result = lotto.add(su);
				if (result == false) {
					System.out.println("중복된 숫자는 안됩니다.");
				}

			} catch (Exception e) {
				System.out.println("숫자만 입력하세요!!!");
				sc.nextLine();
			}
		}

		// lotto 데이터 출력
		for (Integer su : lotto) {
			System.out.print(su + "\t");
		}

		sc.close();

	}

}
