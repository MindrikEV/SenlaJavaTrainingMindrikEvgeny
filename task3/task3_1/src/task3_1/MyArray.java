package task3_1;

import java.util.*;

public class MyArray {
	private int amount;
	private int range;
	private String[] myArray;   
	private final Random random = new Random(); 
	private final String message = "SUM = ";

//---------------------------------------------------	

	public MyArray(int amount, int range){
		this.amount = amount;
		this.range = range;
		myArray = new String[this.amount];
	}
	
//---------------------------------------------------	
	
	public String[] genArray(){
		int sum = 0;
		for(int i=0; i < this.amount; i++){
			myArray[i] = Integer.toString(random.nextInt(this.range));
			sum += Integer.valueOf(myArray[i]);
		}

		String result = new StringBuffer(message).append(Integer.toString(sum)).toString();
		System.out.println(result);
			
		return myArray;
	}
}
