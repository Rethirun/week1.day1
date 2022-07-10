package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize firstnum=0,secnum=1,sum=0
		
		int firstnum=0;
		int secnum=1;
		int sum=0;
		
		System.out.println("Fibonacci Series from 1 to 11 is below:");
		
		System.out.println(firstnum);
		System.out.println(secnum);
		
		//Iterate through 1 to 11
		
		for(int i=1;i<=11;i++) {
			sum=firstnum+secnum;
			firstnum=secnum;
			secnum=sum;
			System.out.println(sum);
		}

	}

}
