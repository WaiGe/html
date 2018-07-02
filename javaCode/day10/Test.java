public class Test {


	public static void main(String[] args) {

		// 8
		int num = 78;
		// 二分法(对半查找) 
		int[] arr = {1, 2, 5, 8, 16, 26, 78, 101};
		int start = 0;
		// 7
		int end = arr.length - 1;
		// 3  8
		int mIndex = (start + end) / 2;
		if (arr[mIndex] > num) {
			end = mIndex - 1;
		} else if (arr[mIndex] < num) {
			start = mIndex + 1;
		} else {
			System.out.println(mIndex);
		}
		// start 4 end 7 
		mIndex = (start + end) / 2;
		if (arr[mIndex] > num) {
			end = mIndex - 1;
		} else if (arr[mIndex] < num) {
			start = mIndex + 1;
		} else {
			System.out.println(mIndex);
		}


	}

}