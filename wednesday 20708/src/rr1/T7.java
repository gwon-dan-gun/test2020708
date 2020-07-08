package rr1;

import java.util.Scanner;

public class T7 {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int i = 0;
		int num = 0;
		int count = 0;
		boolean run = true;
		System.out.println("UP&DOWN");
		num = (int) ((Math.random() * 100)) + 1;
		do {
			System.out.println("1부터 100까지의 숫자을 입력하세요:");
			i = sc1.nextInt();
			count++;
			if (i > num) {

				System.out.println("더 작은 수로 다시 입력하세요");
			} else if (i < num) {
				System.out.println("더 큰 수로 다시 입력하세요");
			} else if (num == i) {
				run = false;

				
			}

		} while (run);
		System.out.println("시도 횟수는" + count + "입니다");
		System.out.println("정답입니다");
		sc1.close();
	}
}
