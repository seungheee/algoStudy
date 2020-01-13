package Stage1;

import java.util.Scanner;

public class baek5_10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//hasNext 입력된 값이 있으면 TRUE, 없으면 FALSE
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}
