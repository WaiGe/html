public class ArrayUtil {


	public static void main(String[] args) {



		int[] arr = {5, 2, 3, 4, 8};
		print(arr);

		reverse(arr);
		print(arr);

		/*
		int[] arr2 = {1, 2, 3, 4, 5};
		int[] rArr = reverse_arr(arr2);
		print(rArr);
		*/

		int[] arr3 = {1, 2, 3, 4, 6, 5, 4, 3, 6};
		System.out.println(indexOf(arr3, 6));
		System.out.println(lastIndexOf(arr3, 6));

		int[] arr4 = arrayCopy(arr3, 4, 8);
		print(arr4);

	}


	// 打印数组中的元素
	public static void print(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	// 逆序
	public static void reverse(int[] arr) {

		for (int i = 0; i < arr.length / 2; i++) {

			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;

		}

	}

	// 逆序2
	public static int[] reverse_arr(int[] arr) {

		int[] result = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			result[i] = arr[arr.length - 1 - i];
		}
		return result;

	}

	// indexOf
	public static int indexOf(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;

	}

	// lastIndexOf
	public static int lastIndexOf(int[] arr, int key) {

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}


	// getMax 
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {

			// max = max > arr[i] ? max : arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		return max;
	}

	// getMin
	public static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			min = min < arr[i] ? min : arr[i];
		}
		return min;
	}

	// arrayCopy
	/**
	  * param1 要拷贝的数组
	  * param2 拷贝的开始位置(包含)
	  * param3 拷贝的结束为止(不包含)
	  * return 返回新的数组
	*/
	public static int[] arrayCopy(int[] arr, int start, int end) {
		if (start < 0 || end < 0) return arr;
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}

		int[] newArr = new int[end - start + 1];
		int i = 0;
		// 新数组的下标
		int j = 0;
		for (i = start; i <= end; i++) {
			newArr[j++] = arr[i];

		}

		return newArr;


	}





}