package task3_4;

public class Array {
	
	public static Doctor[] resize(Doctor[] oldArray){
		Doctor[] newArray = new Doctor[oldArray.length*2];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		return newArray;
	}
//---------------------------------------------------------------------------------	
	public static Patient[] resize(Patient[] oldArray){
		Patient[] newArray = new Patient[oldArray.length*2];
		System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);
		return newArray;
	}
//---------------------------------------------------------------------------------
	public static int getAmountOfElements(Object[] array){
		int amount = 0;
		for(int i=0; i < array.length;i++){
			if(array[i] != null){
				amount++;
			}
		}
		return amount;
	}
//---------------------------------------------------------------------------------
	public static Patient[] delElement(Patient[] array, Patient patient){
		int size = array.length;
		int position = 2;
		Patient[] newArray;
		
		for(int i=0; i < size; i++){
			if (!array[i].equals(patient)){
				continue;
			} else{
				position = i;
				break;
			}
		}
		if(position >= 0 && position < size){
			newArray = new Patient[size - 1];
			System.arraycopy(array, 0, newArray, 0, position);
			System.arraycopy(array, position + 1, newArray, position, size - position - 1);
		}
		return newArray;
	}
}
