package element.hyper.sorting.bubblesort;

class BubbleSortIntArray{

	public static void main(String[] args){

		int[] array = {25,36,15,0,3,9,56,12};
		printArr(array);		
		
		//this is main counter loop
		for(int i = 0; i < array.length; i++){
			
			int temp;
			int flag = 0; // If array is already sorted than there is no need to swap and loop over if counter loop has more loops. So we will check that using this flag

			//-1 because we are not checking last element, as we are doing J+1, in that case it will throw an ArrayIndexOutOfBound Exception
			//-i because we don't want to again check already sorted elements at last position

			//This is swapping loop
			for(int j = 0; j < array.length-1-i	 ; j++){
			
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = 1;
				}
			}

			if(flag == 0){
				break;
			}
		}

		System.out.print("\n");
		printArr(array);

	}

	// Just to print out array
	static void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
}