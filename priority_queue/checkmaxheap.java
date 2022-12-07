public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		return checkMaxHeap(arr,0);
	}
	public static boolean checkMaxHeap(int arr[], int parentNode)
	{
			if(parentNode==0)
			{

			}
			else if(parentNode>=arr.length)
			return true;
			else if(arr[parentNode]>arr[(parentNode-1)/2])
			return false;
			return checkMaxHeap(arr,2*parentNode+1)&&checkMaxHeap(arr,2*parentNode+2);

	}
}