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
				System.out.println("�� ū���� �Է��ϼ���");
			}else if(answer<input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else {
				System.out.println("�����Դϴ�");
				System.out.println("�õ� Ƚ����"+count+"�� �Դϴ�");
				run =false;}
				
			}while(run);
		sc1.close();

		}
		}


