package task3_2;

import java.util.*;

public class Number {
	private int number;
	private Random random = new Random(System.currentTimeMillis());
	
//---------------------------------------------------------------------	
	
	public Number(){		
		this.number = 99 + random.nextInt(999 - 99 + 1);
	}
	
//---------------------------------------------------------------------	

	public String toString(){
		return Integer.toString(this.number);
	}
	
//---------------------------------------------------------------------

	public int getMax(){
		int max;
		int a = (this.number/100)%10;
		int b = (this.number/10)%10;
		int c = this.number%10;

		if(a >= b && a > c)
			max = a;  				
		else if (b > a && b >= c)
			max = b;
		else
			max = c;
		
		return max;
	}
}