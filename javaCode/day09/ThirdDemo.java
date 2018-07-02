public class ThirdDemo {

	public static void main(String[] args) {


		int a = 5;
		int b = 6;
		swap(a, b);
		System.out.println("a = " + a + ", b = " + b);


		int[] arr = {1, 2};
		swap(arr);
		System.out.println("arr[0] = " + arr[0] + ", arr[1] = " + arr[1]);
	}

	// 交换两个变量的值的函数
	static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}

	// 交换数组中两个不同位置上的元素的值
	static void swap(int[] arr) {
		if (arr.length < 2) return;
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}


}