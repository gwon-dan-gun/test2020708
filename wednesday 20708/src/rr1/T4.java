package rr1;

import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// ���� �Է¿� ����
		int num = 0;
		// �հ�� ����
		int sum = 0;
		// ������ ����
		int count = 0;
		// �ݺ���� ���� ����
		boolean run = true;
		System.out.println("������ �Է¶�� �������� 0�� �Է��ϼ���");
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
