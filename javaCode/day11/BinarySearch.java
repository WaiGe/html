public class BinarySearch{
	public static void main(String[] args) {
		int[] arr = {1, 3, 6, 7, 9, 15};
		System.out.println(BinarySearch(arr , 7));
		System.out.println(BinarySearch(arr , 8));
	}

	public static int BinarySearch(int[] arr, int key){
		int start = 0;
		int end = arr.length - 1;
		while(start <= end){
			int mid = (start + end) / 2;
			if(arr[mid] < key){
				start = mid + 1;
			}else if(arr[mid] > key){
				end = mid - 1;
			}else{
				return mid;
			}
		}
		return -1;
	}
}