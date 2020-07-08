package rr1;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 숫자 입력용 변수
		int num = 0;
		// 합계용 변수
		int sum = 0;
		// 객수용 변수
		int count = 0;
		// 반복제어를 위한 변수
		boolean run = true;
		System.out.println("정수을 입력라고 마지막에 0을 입력하세요");
		do {
			num = sc.nextInt();
			if (num == 0) {
				run = false;
			} else {
				sum += num;
				count++;
			}

		} while (run);
		System.out.println(count);
		System.out.println(sum/count);
sc.close();
	}

}
