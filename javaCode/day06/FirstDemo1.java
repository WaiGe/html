public class FirstDemo1 {

	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();


		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 9; i++) {
				// System.out.print("*");
				if (i >= 4 - j && i <= 8 - j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.ouy.println();
		}
		System.out.println();

		int n = 5;
		for (int j = 0; j < n; j++) {

			for (int i = 0; i < 2 * n - 1; i++) {

				if (i >= n - 1 - j && i <= n - 1 + j) {
					System,out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			 System.out.println(); 	 
		}
		System.out.println();

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < 2 * n - 1; i++) {
				if (i >= j && i <= 2 * n - 2 - j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();


		for (int j = 1; j <= 2 * n - 1;j++) {

			for(int i = 1; i <= 2 * n - 1; i++) {

				// 上半部三角形

				if (j <= n) {

					if (i >= n - (j - 1) && i <= n + j - 1) {
						System.out.print("*");
					} else {
						System.out.print("*");
					}

				} else {
					// 下半部三角形
					if (i >= n - (2 * n - 1 - j) && i <= n +(2 * n - 1 - j)) {

						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}


			}
			System.out.println(); 
		}








	}
}