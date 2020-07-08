package rr1;

public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		int sum = 0;
		boolean run = true;
		while (run) {
			
			num++;
			if (num % 2 == 0)
				sum -= num;
		else {
				sum+=num;
				
			}if(sum>=100)
				run=false;
               
		}while(run);
		System.out.println("="+num);
	}
}
