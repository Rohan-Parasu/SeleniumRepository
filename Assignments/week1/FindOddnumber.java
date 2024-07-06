package Assignments.week1;

public class FindOddnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxrange= 10; //maximium iteration is declared
		System.out.println("Odd numbers between 1 to 10");
		for(int i=1;i<=maxrange;i++) //interation begin upto 10 which is defined outside for loop statement
		{
			if(i%2==1) //when i have the modulus value as 1 , it excuted into if statement and print the value
			{
				System.out.println(i + " is an odd number");
			}
		}

	}

}
