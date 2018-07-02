public class FirstDemo {

	// 定义一个静态方法
	// 定义方法时, 方法中的代码并不会被执行
	// 无参无返回值的函数
	public static void printTriangle() {
		for (int j = 0; j < 5; j++) {

			for (int i = 0; i < 2 * 5 - 1; i++) {

				if (i >= 5 - 1 - j && i <= 5 - 1 + j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	// 有参无返回值的函数
	// 定义方法时, 括号中的参数为形式参数
	// n = 10
	static void printNTriangle(int n) {

		for (int j = 0; j < n; j++) {

			for (int i = 0; i < 2 * n - 1; i++) {

				if (i >= n - 1 - j && i <= n - 1 + j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}



	// 无参有返回值的函数
	static String coolBoy() {
		return "歪哥";
	}

	// 有参有返回值的函数
	static double square(double n) {
		return n * n;
	}


	public static void main(String[] args) {

		// 调用一个方法
		printTriangle();
  			
		// printTriangle();

		// 调用函数时, 括号中的参数为实际参数
		// 调用函数时, 形参会拷贝实参的值
		printNTriangle(10);

		String boy = coolBoy();
		System.out.println(boy);

		double result = square(5.5);
		System.out.println(result);
	}

	// 定义一个求和函数, 求差函数, 求积函数, 求商函数, 求余数函数
	// 定是平年义一个判断还是闰年的函数(提示返回值为boolean类型)
	// 定义一个求两个数的最大数的函数, 定义一个求两个数的最小数的函数
	


}