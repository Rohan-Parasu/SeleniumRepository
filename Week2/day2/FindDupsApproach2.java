package Week2.day2;

import java.util.Arrays;

public class FindDupsApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(num);
		for(int i =0; i< num.length;i++) {
			if(num[i] == num[i+1]) 
			{
				System.out.println(num[i]);
				break;
			}
		}

	}

}
