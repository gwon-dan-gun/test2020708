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
			System.out.println("1���� 100������ ������ �Է��ϼ���:");
			i = sc1.nextInt();
			count++;
			if (i > num) {

				System.out.println("�� ���� ���� �ٽ� �Է��ϼ���");
			} else if (i < num) {
				System.out.println("�� ū ���� �ٽ� �Է��ϼ���");
			} else if (num == i) {
				run = false;

				
			}

		} while (run);
		System.out.println("�õ� Ƚ����" + count + "�Դϴ�");
		System.out.println("�����Դϴ�");
		sc1.close();
	}
}
