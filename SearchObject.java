class SearchObject {

public static int linearSearch(Object [] inputArray, int arraySize, Object searchKey){
		for (int i = 0; i < arraySize; i++) {
			if(searchKey.equals(inputArray[i])){
				return i;
			}
		}
		return -1;
	}


  public static int binarySearch(Object[] inputArray, int arraySize, Comparable searchKey) {
		int leftBoundary = 0;
		int rightBoundary = inputArray.length - 1;
		
    while(leftBoundary <= rightBoundary){
			int midIndex = leftBoundary + rightBoundary;
			if (searchKey.equals(inputArray[midIndex])){
				return midIndex;
			}
			else if(searchKey.compareTo(inputArray[midIndex]) < 0){
				rightBoundary = midIndex - 1;
			}
			else if(searchKey.compareTo(inputArray[midIndex]) > 0){
				leftBoundary = midIndex + 1;
			}
		}
		return -1;
	}
}

