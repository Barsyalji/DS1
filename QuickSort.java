package basic;
public class QuickSort {
	public static void quickSort(int arr [],int low ,int high)
	{
		if(low<high)
		{
			 int pivx = Sort(arr,low,high);
			 quickSort( arr ,low , pivx-1);
			 quickSort( arr ,pivx+ 1, high);
			
		}
	}
	public static int Sort(int arr [],int low ,int high)
	{
		int piv = arr[high];
		int i = low-1;
		for(int j = low; j<high;j++)
		{
			if(arr[j]<piv) {
			i++;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
			}
		}
			i++;
			int temp = arr[i];
			arr[i] = piv;
			arr[high] = temp;
			return i;
			
		}
	
	   public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 7, 6, 1, 8, 4};
        quickSort(arr, 0, arr.length - 1);
        for(int i =0 ; i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
      
}
}
