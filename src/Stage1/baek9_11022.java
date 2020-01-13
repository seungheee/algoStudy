package Stage1;

import java.util.Scanner;

public class baek9_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		//next() : 한 단어(공백기준)단위로 입력, nextLine():한 줄 단위로 입력 
		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int num = a+b;
			System.out.println("Case #"+ i +": " + a + " + " + b + " = "+num);
		}

	}

}