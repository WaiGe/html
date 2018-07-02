public class SecondDemo {

	public static void main(String[] args) {

		// 逻辑运算符的短路现象
		int a = 5;

		// 逻辑与运算符左边如果为假, 那么右边的代码将不会被执行
		boolean flag = a++ > 5 && ++a < 8;
		System.out.println(flag);
		System.out.println(a);

		// 逻辑或运算符左边如果为真, 那么右边的代码将不会被执行
		int b = 3;
		flag = b < 5 || b++ < 10;
		System.out.println(b);

		// 根据操作数的不同, 运算符可以分为单元(单目)运算符, 双元运算符(双目), 三元(三目)运算符
		// 三元运算符  ? :
		// 求两个数的最大数
		int num1 = 10;
		int num2 = 6;
		int num3 = num1 > num2 ? num1 : num2;
		System.out.println("num3 = " + num3);


		float f1 = 2.53f;
		int r = (int)(f1 + 0.5);
		System.out.println(r);

		// 去掉整数部位
		f1 -= (int)f1;
		// 判断小数部位是否大于等于0.5
		r = f1 >= 0.5 ? (int)f1 + 1 : (int)f1;
		System.out.println(r);

		// 判断是奇数还是偶数
		int num_int = 5;
		String str = num_int % 2 == 0 ? "偶数" : "奇数";
		System.out.println("num_int 是" + str);

		// 如何交换两个变量的值
		int x = 5;
		int y = 10;
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);


	}


}