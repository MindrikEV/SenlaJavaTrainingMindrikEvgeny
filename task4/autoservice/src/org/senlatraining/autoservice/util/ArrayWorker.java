package org.senlatraining.autoservice.util;

public class ArrayWorker {
	
	public Object[] resize(Object[] oldArray){ 							// Get double size of array(resizing)
		int size = oldArray.length;
		
		Object[] newArray = new Object[size * 2];
		System.arraycopy(oldArray, 0, newArray, 0, size);
		
		return newArray;
	}
//-----------------------------------------------------------------------
	public Integer countOfElements(Object[] array){						// Get amount of not empty(non-null) elements in array 
		Integer count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				count++;
			}
		}
		return count;
	}
//-----------------------------------------------------------------------
	public void addElement(Object[] array, Object element){				// Add new element in to array
		if(countOfElements(array) == array.length){
			array = resize(array);
		}
		for(int i = 0; i < array.length; i++){
			if(array[i] == null){
				array[i] = element;
				break;
			}
		}
	}
//-----------------------------------------------------------------------
	public Object[] removeElement(Object[] array, Object object){		// Remove element from array and decrement size of array
		for(int i = 0; i < array.length; i++){
			if (!array[i].equals(object)){
				continue;
			} else {
				array[i] = null;
				break;
			}
		}
		return array;
	}
//-----------------------------------------------------------------------	
	public void ShowList(Object[] array){									// Print all elements from array without nulls
		for(int i = 0; i < array.length; i++){ 
			if(array[i] != null){
				System.out.println(array[i]);
			} else {
				continue;
			}
		}
	}
//-----------------------------------------------------------------------
	/*public void getListOfEmptyElements(Object[] array){				// Get list of empty(null) elements in array 
		for(int i = 0; i < array.length; i++){
			if(array[i] == false){
				System.out.println(array[i].toString());
			}
		}
	}*/
}

