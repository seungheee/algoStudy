package Stage1;

import java.util.Scanner;

public class beak13_11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		boolean tf = true;
		
		while (tf) {
			for (int i = 0; i < input.length(); i++) {
				System.out.print(input.charAt(i));
				// 10���ɰ����� �ຯȯ
				if (i % 10 == 9) {
					System.out.println();
				}
				if(i == input.length()-1) {
					tf=false;
				}

			}
		}
	}
}

