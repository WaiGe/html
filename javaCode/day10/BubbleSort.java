public class BubbleSort {


	public static void main(String[] args) {

		int[] arr = {5, 6, 3, 2, 1};
		// 第一轮
		// 第一次比较
		/*
		if (arr[0] > arr[1]) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}

		if (arr[1] > arr[2]) {
			int temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}

		if (arr[2] > arr[3]) {
			int temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}

		if (arr[3] > arr[4]) {
			int temp = arr[3];
			arr[3] = arr[4];
			arr[4] = temp;
		}
		*/

		/*
		// 第一轮比较4次
		for (int i = 0; i < arr.length - 1 - 0; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}

		}

		// 第二轮比较3次
		for (int i = 0; i < arr.length - 1 - 1; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		// 第三轮比较2次
		for (int i = 0; i < arr.length - 1 - 2; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}

		// 第四轮比较1次
		for (int i = 0; i < arr.length - 1 - 3; i++) {
			if (arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		*/

		bubbleSort(arr);
		eachArray(arr);


	}

	public static void bubbleSort(int[] arr) {

		// 外层循环控制比较的轮数
		for (int i = 0; i < arr.length - 1; i++) {

			// 内层循环控制每轮比较的次数
			for (int j = 0; j < arr.length - 1 - i; j++) {

				// 核心代码
				if (arr[j] > arr[j+1]) {

					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}
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