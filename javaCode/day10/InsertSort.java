public class InsertSort {


	public static void  main(String[] args) {

		// 插入排序
		int[] arr = {6, 5, 3, 1, 2};

		// 第一轮 比较1次
		int i = 1;
		int j;
		// 要拿的牌
		int target = arr[i];
		// 和手里面已经存在的牌进行比较
		for (j = i; j > 0; j--) {
			if (target < arr[j-1]) {
				arr[j] = arr[j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		// {5, 6, 3, 1, 2}
		// {5, 6, 6, 1, 2}
		// {5, 5, 6, 1, 2}
		// {3, 5, 6, 1, 2}
		// 第二轮 比较2次
		i = 2;
		target = arr[i];
		for (j = i; j > 0; j--) {
			if (target < arr[j-1]) {
				arr[j] = arr[j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		// 第三轮 比较3次
		i = 3;
		target = arr[i];
		for (j = i; j > 0; j--) {
			if (target < arr[j-1]) {
				arr[j] = arr[j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		// 第三轮 比较3次
		i = 4;
		target = arr[i];
		for (j = i; j > 0; j--) {
			if (target < arr[j-1]) {
				arr[j] = arr[j-1];
			} else {
				break;
			}
		}
		arr[j] = target;

		eachArray(arr);


	}

	// 插入排序
	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j;
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

	// 遍历数组函数
	public static void eachArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}
		System.out.println();

	}



}