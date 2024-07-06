package Assignments.week1;


public class PalinedromeWithWhile {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input=15351, output=0,temp=input; 
		 while (input>0) {
			 int rev =input % 10;
			 output=output*10+rev;
			 input =input/10;
		 }
		 if(output == temp) {
			 System.out.println("given number is palindrome");
		 }
		 else {
			 System.out.println("given number is not a palindrome");
		 }
		
	}

}
