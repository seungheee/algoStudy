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

			// charAt (�����߿� �ε��� ��ġ�� �ش�Ǵ� ���� �����ϱ�)
			for (int i = 0; i < num; i++) {

				// input.charAt() : String-> Char�� ��ȯ
				// char-> int ��� : �� ������ �ƽ�Ű�ڵ�� 0�� �ǹ��ϴ� 48�� ���ָ� �ڽ��� ���� ���ָ� ���´�.
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

