public class BinarySearch {


	public static void main(String[] args) {

		int num = 26;

		// 二分法(对半查找) 
		int[] arr = {1, 2, 5, 8, 16, 26, 78, 101};

		/*
		// 初始位置
		int start = 0;

		// 结束位置
		int end = arr.length - 1;


		// 中间数的坐标
		int mIndex = (start + end) / 2;

		while (start <= end) {

			if (arr[mIndex] < num) {
				start = mIndex + 1;
			} else if (arr[mIndex] > num) {
				end = mIndex - 1;
			} else {
				break;
			}
			mIndex = (start + end) / 2;

		}
		System.out.println("num的下标为: " + mIndex);
		*/


	}


	// 二分查找法
	public static int binarySearch(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;
		int mIndex = (start + end) / 2;
		while (start <= end) {

			if (arr[mIndex] < key) {
				start = mIndex + 1;
			} else if (arr[mIndex] > key) {
				end = mIndex - 1;
			} else {
				return mIndex;
			}
			mIndex = (start + end) / 2;

		}
		// 没找到
		return -1;

	}

	// 作业: 




}