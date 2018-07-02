public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1, 6, 7, 8};
		// BubbleSort(arr);
		// SelectionSort(arr);
		InsertSort(arr);
		// print(arr);
		System.out.println(BinarySearch(arr,8));

	} 
	public static void BubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void SelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}
	public static void InsertSort(int[] arr) {
		int j;

		for (int i = 1; i < arr.length; i++) {
			int target = arr[i];
			for (j = i; j > 0; j--) {
				if (target < arr[j-1]) {
					arr[j] = arr[j-1];
					
				} else {
					break;
				}
			}
			arr[j] = target;
		}
	}
	public static int BinarySearch(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] < key) {
				start = mid + 1;
			} else if (arr[mid] > key) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
	static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}