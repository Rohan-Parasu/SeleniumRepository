package week1.day2;

public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxrange= 10;
		System.out.println("Odd numbers between 1 to 10");
		for(int i=1;i<=maxrange;i++)
		{
			if(i%2==1) 
			{
				System.out.println(i + " is an odd number");
			}
		}

	}

}
