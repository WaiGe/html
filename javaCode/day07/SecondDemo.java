public class SecondDemo {

	// 求和函数
	static int sum(int a, int b) {
		int c = a + b;
		return c;
	}

	// 求差函数
	static int sub(int a, int b) {
		return a - b;
	}

	// 求积函数
	static int mul(int a, int b) {
		return a * b;
	}

	// 求商
	static int div(int a, int b) {

		if (b == 0) {
			return Integer.MAX_VALUE;
		}
		// return 立即结束函数的调用, return语句后面的代码不会再执行
		return a / b;
		// System.out.println("6666");
	}

	// 取余的函数
	static int mol(int a, int b) {
		if (b == 0) {
			return Integer.MAX_VALUE;
		}
		return a % b;
	}

	// 求两个数的最大数
	static int maxNumber(int a, int b) {
		// return a > b ? a : b;
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// 判断年份是平年还是闰年
	static boolean isLeapYear(int year) {

		// 闰年条件
		// 能被4整除但不能被100整除
		// 能被400整除
		boolean flag1 = mol(year, 4) == 0 && mol(year, 100) != 0;
		boolean flag2 = mol(year, 400) == 0;
		return flag1 || flag2;

	}

	public static void main(String[] args) {


		System.out.println(sum(5, 6));
		System.out.println(sub(10, 20));
		System.out.println(mul(29, 30));
		System.out.println(div(5, 0));
		System.out.println(mol(-3, 6));

		boolean flag = isLeapYear(2000);
		if (flag == true) {
			System.out.println("闰年!");
		} else {
			System.out.println("平年!");
		}

	}
	// 作业1: 封装一个函数, 判断星座
	// 作业2: 封装一个函数, 判断该日期是该年的第几天
	// 作业3: 乘法口诀表抄20遍
	





}