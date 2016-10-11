package task3_1;

public class Main {
	public static void main(String[] args){
		int l = 100; 	// length of array
		int r = 999; 	// random range
		
		MyArray ma = new MyArray(l,r);
		String[] strArray = ma.genArray();
		
		for(int i=0;i<l;i++)
		System.out.println(strArray[i]);
	}
}
		