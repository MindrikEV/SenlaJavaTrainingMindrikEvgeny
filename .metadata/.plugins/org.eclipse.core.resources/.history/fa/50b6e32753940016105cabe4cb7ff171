package com.autoservice.java;
/**
 * 
 * This class work with arrays
 * 
 */
public class ArrayWorker {
	
	public static Object[] resize(Object[] oldArray){ 					// Get double size of array
		int size = oldArray.length;
		
		Object[] newArray = new Object[size * 2];
		System.arraycopy(oldArray, 0, newArray, 0, size);
		
		return newArray;
	}
//-----------------------------------------------------------------------
	public static Integer countOfElements(Object[] array){					// Get amount of not empty elements in array 
		Integer count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				count++;
			}
		}
		return count;
	}
//-----------------------------------------------------------------------
	public static void addElement(Object[] array, Object element){				// Add new element in to array
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
	public static Object[] removeElement(Object[] array, Object object){		// Remove element from array
		int size = array.length;
		int position = 0;
		Object[] newArray = new Object[size - 1];
		
		for(int i = 0; i < size; i++){
			if (!array[i].equals(object)){
				continue;
			} else {
				position = i;
				break;
			}
		}
		if(position >= 0 && position < size){
			System.arraycopy(array, 0, newArray, 0, position);
			System.arraycopy(array, position + 1, newArray, position, size - position - 1);
		}
		return newArray;
	}
//-----------------------------------------------------------------------	
	public static void Show(Object[] array){
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i].get());
		}
	}
}
