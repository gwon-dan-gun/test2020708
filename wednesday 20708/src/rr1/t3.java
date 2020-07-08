package rr1;

import java.util.Scanner;

public class t3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 =new Scanner (System.in);
		int i =0;
		int n=0;
		int sum=0;
		int avg=0;
		boolean run =true;
System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		while(run) {
			n=sc1.nextInt();
			if(n==0) {
				
				
				run=false;
			}
			else {sum+=n;
				i++;
				avg=sum/i;
			
			}
		}
		System.out.println("입력한 수는"+i);
		System.out.println("평균은"+avg);
		sc1.close();
	}

}
