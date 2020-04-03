class InsertionSort{
  public static int[] insertionSort(int[] array) {
    // Write your code here.
		if(array.length == 0){
			return new int[]{};
		}
		for (int i = 1 ; i < array.length ;i++){
			int j = i;
			while (j > 0 && array[j] < array[j-1])
			{	swap(array,j, j-1);
			  j--;
		}}
    return array;
  }
	public static void swap(int[] array, int from, int to){
		int temp = array[from];
		array[from] = array[to];
		array[to] = temp;
	}
  
}
