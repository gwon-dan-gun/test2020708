package rr1;

public class T6 {

	public static void main(String[] args) {
		int sum = 0;// 합계용 변수
		int num = 0;// 숫자용 변수
		int count = 1;// 숫자용 변수
		int s = 1; // 부호용 변수
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
		System.out.println("숫자:"+num);

	}
}
