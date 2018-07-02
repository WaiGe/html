public class ForthDemo {

	public static void main(String[] args) {

		/*
		// 循环嵌套
		for (int i = 1; i <= 9; i++) {

			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {

			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i <= 9; i++) {

			System.out.print(i + " ");
		}
		System.out.println();
		*/

		for (int j = 1; j <= 9; j++) {
			for (int i = 1; i <= j; i++) {

				System.out.print(i + "*" + j + "=" + i * j + " ");
			}
			System.out.println();
		}




	}



}