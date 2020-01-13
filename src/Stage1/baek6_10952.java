package Stage1;

import java.util.Scanner;

public class baek6_10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//hasNext 입력된 값이 있으면 TRUE, 없으면 FALSE
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) {
				break;
			}
			System.out.println(a+b);
		}
	}
}
