public class Cr {
	public static void main(String[]args) {
		int[] arr = {2, 5, 7, 8, 4, 1};
		C(arr);
		each(arr);
	}

	static void C(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int ter = arr[i];
			int j;
			for (j = i; j > 0; j--) {
				if (ter > arr[j - 1]) {
					arr[j] = arr[j - 1];
				} else {
					break;
				}
			}

			arr[j] = ter;
		}
	}


	static void each(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}