public class Calculate01 {


	public static void main(String[] args) {

		// 算术运算符
		int a = 5;
		int b = 3;

		// + - * / %
		int c = a + b;
		System.out.println("c = " + c);

		c = a - b;
		System.out.println("c = " + c);

		c = a * b;
		System.out.println("c = " + c);

		c = a / b;
		System.out.println("c = " + c);

		c = a % b;
		System.out.println("c = " + c);

		// ++(--) 自增(自减)运算符
		int x = 1;
		x++;
		System.out.println("x = " + x);
		++x;
		System.out.println("x = " + x);

		int y = x++;
		System.out.println("y = " + y);
		System.out.println("x = " + x);

		y = ++x;
		System.out.println("y = " + y);
		System.out.println("x = " + x);

		// 自增(自减)运算符在前表达式取新值, 自增(自减)运算符在后表达式取旧值

		int n = 5;
		int m = ++n + n++ - n-- + --n;
		System.out.println("m = " + m + ", n = " + n);

		// 赋值运算符
		// = += -= *= /= %=
		int num = 5;
		num += 2; // num = num + 2;
		System.out.println("num = " + num);

		num -= 5;
		System.out.println("num = " + num);

		num *= 3;
		System.out.println("num = " + num);

		num /= 2;
		System.out.println("num = " + num);

		num %= 2; // num = num % 2;
		System.out.println("num = " + num);

		byte numB = 5;
		// numB = numB + 2;
		numB += 2;
		System.out.println("numB = " + numB);

		// 比较运算符 == > < != >= <= instanceof
		// 比较运算符都有一个boolean类型的返回值
		System.out.println(5 == 5);
		System.out.println(65 == 'A');
		System.out.println(1 == 1.0);

		System.out.println("I love you" instanceof String);

		// 逻辑运算符
		// 按位与 &
		System.out.println(5 & 6);

		// 按位或 |
		System.out.println(7 | 8);

		// 按位异或 ^
		System.out.println(4 ^ 6);


		// 逻辑与, 运算符两边同时为真才为真
		System.out.println(5 > 3 && 3 > 5);

		// 逻辑或, 运算符两边同时为假才为假
		System.out.println(5 > 3 || 3 < 5);

		// 逻辑非, 非真即假, 非假即真
		boolean flag = 6 != 3;
		System.out.println(!flag);



	}

}