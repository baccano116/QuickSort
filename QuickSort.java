


	public class QuickSort  {
	    private int[] tempArray;
	    private int max;

	    public void sort(int[] a) {
	        if (a ==null || a.length==0){
	            return;
	        }
	        tempArray = a;
	        max = a.length;
	        quicksort(0, max - 1);
	    }

	    private void quicksort(int low, int high) {
	        int i = low, j = high;
	        // Get the pivot element from the middle of the list
	        int pivot = tempArray[(low + high)/2];

	        // Divide into two lists
	        while (i <= j) {
	           
	            while (tempArray[i] < pivot) {
	                i++;
	            }
	            
	            while (tempArray[j] > pivot) {
	                j--;
	            }	            
	            if (i <= j) {
	            	int temp = tempArray[i];
	    	        tempArray[i] = tempArray[j];
	    	        tempArray[j] = temp;
	                i++;
	                j--;
	            }
	        }
	        if (low < j)
	            quicksort(low, j);
	        if (i < high)
	            quicksort(i, high);
	    }

	}
	

