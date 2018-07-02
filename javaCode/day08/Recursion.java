public class Recursion {

	// 递归函数
	// 在函数内部直接或者间接的调用函数本身(调用同名函数)
	static int recur(int n) {

		// 给一个出口
		if (n <= 1) {
			return 1;
		}

		return n * recur(n - 1);
	}

	// 裴波那契数列
	static int func(int n) {
		if (n == 0) return 0;
		if (n == 1) return 1;

		return func(n - 1) + func(n - 2);
	}

	static int sum(int n) {
		if (n <= 0) return n;
		return n + sum(n - 1);
	}


	public static void main(String[] args) {


		int result = recur(5);
		System.out.println(result);

		result = func(10);
		System.out.println(result);

		result = func(0);
		System.out.println(result);

		result = func(1);
		System.out.println(result);
	}

}