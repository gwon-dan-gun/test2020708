package rr1;

import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		int n=0;
		int sum=0;
		int i=0;
		while((i=sc1.nextInt())!=0){
			
			sum+=i;
			n++;
		}System.out.println(n);
		System.out.println(sum/n);
		sc1.close();
	}
	
}


