package Stage1;

import java.util.Scanner;

public class baek7_10953 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		//next() : �� �ܾ�(�������)������ �Է�, nextLine():�� �� ������ �Է� 
		for (int i = 0; i < t; i++) {
			String[] arr = sc.next().split(",");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			System.out.println(a+b);
		}

	}

}

