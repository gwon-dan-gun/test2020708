package rr1;

public class T6 {

	public static void main(String[] args) {
		int sum = 0;// �հ�� ����
		int num = 0;// ���ڿ� ����
		int count = 1;// ���ڿ� ����
		int s = 1; // ��ȣ�� ����
		boolean run = true;
		while (run) {
			sum += num;
			if (sum >= 100) {
				run = false;
			} else {
				num = s * count;
				s = -s;//
				count++;
			}

		}
		System.out.println("����:"+num);

	}
}
