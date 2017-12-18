package kadai5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		System.out.println("足し算:"+ (a + b));
		System.out.println("引き算:"+ (a - b));
		System.out.println("掛け算:"+ (a * b));
		System.out.println("割り算:"+ (a / b));
		
		scanner.close();

	}

}
