package rr1;

import java.util.Scanner;

public class T8 {

	public static void main(String[] args) {
		int answer =(int)(Math.random()*100)+1;
		int input =0;
		int count =0;
		boolean run =true;
		Scanner sc1=new Scanner(System.in);
		System.out.println("up&down");
		do{
			System.out.println();
			input=sc1.nextInt();
			count++;
			if(answer> input) {
				System.out.println("더 큰수를 입력하세요");
			}else if(answer<input) {
				System.out.println("더 작은 수를 입력하세요");
			}else {
				System.out.println("정답입니다");
				System.out.println("시도 횟수는"+count+"번 입니다");
				run =false;}
				
			}while(run);
		sc1.close();

		}
		}


