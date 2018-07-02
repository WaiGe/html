public class Person03 {

	public static void main(String[] args) {
		// 定义一个boolean类型的变量, 只有true和false两种情况
		boolean flag = true;
		boolean flag2 = false;

		// 二进制的数以0b(0B)开头
		int a = 0b111;
		System.out.println(a);

		// 十进制转化成其它进制方法: 连除倒取余
		System.out.println(Integer.toBinaryString(17));

		// 练习: 将53, 67转化成二进制
		// 53: 110101 67:1000011

		// 将0b1011 转化成十进制的数
		// 结果11

		// 八进制的数以0开头
		System.out.println(017);

		// 其它进制转化成10进制, 按权求和

		// 十六进制的数以0x开头
		// a代表10, b代表11, c代表12, d代表13, e代表14, f代表15
		System.out.println(0xefa);

		// 练习 0x57 转化成二进制, 十进制, 八进制


		// 整型中有byte, short, int, long
		byte b1 = 127;
		byte b2 = 2;
		byte b3 = (byte)(b1 + b2);
		// 溢出: 当要表示的数据超出了数据类型的临界范围时称为溢出
		System.out.println(b3);

		// 定义一个short类型变量
		short s1 = 5;
		short s2 = 10;
		short s3 = (short)(s1 + s2);
		System.out.println(s3);

		// 定义一个int类型变量
		int num1 = 20;
		int num2 = 23;
		int num3 = num1 + num2;
		System.out.println(num3);

		// 定义一个long类型变量
		long l1 = 100L;
		long l2 = 200L;
		long l3 = l1 + l2;
		System.out.println(l3);

		// 小数类型
		// 字面量小数默认是double类型
		float f1 = (float)3.14;
		System.out.println(f1);

		// 默认情况下, 一个浮点型的字面量默认是double类型, 要想设置为float类型, 需要在数字后面加上f或F, double类型的小数后面为D或d, d或D可以省略
		float f2 = 5.3F;
		System.out.println(f2);

		// 科学计数法, e大小写无影响
		double d1 = 3.14E2 + 5;
		double d2 = 8.98D;
		System.out.println(d1);
		System.out.println(d2);


		// char(字符)类型
		char c1 = '\u6211';
		System.out.println(c1);

		char c2 = 'A';
		System.out.println(c2);
		// 输出A对应的ASCII码值
		System.out.println((int)c2);

		char c3 = '+';
		System.out.println(c3);


	}

}