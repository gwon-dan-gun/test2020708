package rr1;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1 = new Scanner(System.in);
		int num = 0;
		boolean run = true;
		do {
			System.out.println("�����Է�:");
			num = sc1.nextInt();
		if (num % 2 == 0 && num > 0)
				System.out.println("¦��");
			else if (num % 2 == 1)
				System.out.println("Ȧ��");
			else
				run = false;
		} while (run);
		System.out.println("����");
		sc1.close();
	}

}
