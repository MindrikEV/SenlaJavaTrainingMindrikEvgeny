package org.senlatraining.autoservice.util;

public class ArrayWorker {
	
	public Object[] resize(Object[] oldArray){ 							// Get double size of array(resizing)
		int size = oldArray.length;
		
		Object[] newArray = new Object[size * 2];
		System.arraycopy(oldArray, 0, newArray, 0, size);
		
		return newArray;
	}
//-----------------------------------------------------------------------
	public Integer countOfElements(Object[] array){						// Get amount of not empty(not-null) elements in array 
		Integer count = 0;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] != null){
				count++;
			}
		}
		return count;
	}
//-----------------------------------------------------------------------
	public void addElement(Object[] array, Object element){				// Add new element into array
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
	public Object[] removeElement(Object[] array, Object object){		// Remove element from array
		for(int i = 0; i < array.length; i++){
			if (array[i].equals(object)){
				array[i] = null;
				break;
			}
		}
		return array;
	}
//-----------------------------------------------------------------------
	public Object[] getListOfNotNull(Object[] array){									// Return all elements from array without nulls
		Object[] newArray = new Object[countOfElements(array)];
		Integer k = 0;
		
		for(int i = 0; i < array.length; i++){ 
			if(array[i] != null){
				newArray[k] = array[i];
				k++;
			}
		}
		return newArray;
	}
//-----------------------------------------------------------------------
	public Object searchElement(Object[] array, Object obj){
		Integer position = 0;
		
		for(int i=0; i < array.length; i++){
			if((array[i] != null)
			&&(array[i].equals(obj))){
				position = i;
				break;
			}
		}
		return array[position];
	}
}

