public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {5, 6, 3, 2, 1};
		int i = 0;
		// 第一轮
		int minIndex = i;
		for (int j = 1; j < arr.length; j++) {
			if (arr[minIndex] > arr[j]) {
				minIndex = j;
			}
		}

		/*
		if (arr[minIndex] > arr[1]) {
			minIndex = 1;
		}

		// minIndex = 2;
		if (arr[minIndex] > arr[2]) {
			minIndex = 2;
		}

		// minIndex = 3;
		if (arr[minIndex] > arr[3]) {
			minIndex = 3;
		}

		// minIndex = 4;
		if (arr[minIndex] > arr[4]) {
			minIndex = 4;
		}

		*/


		if (minIndex != i) {
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}


		// 第二轮
		i = 1;
		minIndex = i;
		for (int j = 2; j < arr.length; j++) {
			if (arr[minIndex] > arr[j]) {
				minIndex = j;
			}
		}
		if (minIndex != i) {
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		// 第三轮
		i = 2;
		minIndex = i;
		for (int j = 3; j < arr.length; j++) {
			if (arr[minIndex] > arr[j]) {
				minIndex = j;
			}
		}
		if (minIndex != i) {
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}

		// 第四轮
		i = 3;
		minIndex = i;
		for (int j = 4; j < arr.length; j++) {
			if (arr[minIndex] > arr[j]) {
				minIndex = j;
			}
		}
		if (minIndex != i) {
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}


		eachArray(arr);

		int[] arr2 = {45, 67, 98, 102, 43, 2, 1};
		selectionSort(arr2);
		eachArray(arr2);

	}

	// 选择排序
	public static void selectionSort(int[] arr) {

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

	public static void eachArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}