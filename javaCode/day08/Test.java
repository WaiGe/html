public class Test {

	// n = a;
	static int sum(int n) {
		n++;
		return n;
	}

	static int add(int[] a) {
		a[0] = 20;
		return 66;
	}

	public static void main(String[] args) {

		int a = 5;
		int r = sum(a);
		System.out.println(r);
		System.out.println(a);

		int[] arr = {1, 2};
		add(arr);
		System.out.println(arr[0]);


	}


}