package Stage1;

import java.util.Scanner;

public class baek12_11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {

			int num = sc.nextInt();
			String input = sc.next();
			int sum = 0;

			// charAt (문장중에 인덱스 위치에 해당되는 문자 추출하기)
			for (int i = 0; i < num; i++) {

				// input.charAt() : String-> Char로 변환
				// char-> int 방법 : 각 숫자의 아스키코드는 0을 의미하는 48을 빼주면 자신의 수를 뺴주면 나온다.
				sum = sum + input.charAt(i) - '0';
			}
			System.out.println(sum);

		}

//		int num = sc.nextInt();
//		int sum = 0;
//		for (int i = num; i >0; i--) {
//			sum = sum + i ;
//			System.out.print(i);
//		}
//		System.out.println("\n" + sum);

	}

}

