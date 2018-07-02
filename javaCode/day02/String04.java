public class String04 {


	public static void main(String[] args) {

		// 字符串类型
		String str = "I love you!";
		System.out.println(str);

		// 字符串通过 + 号可以拼接在一起
		String str2 = "I " + "love " + "you";
		System.out.println(str2);

		// 字符串和任意类型相连接, 结果都是字符串
		System.out.println("1" + "6");
		System.out.println(1 + "6");
		System.out.println(7 + 8 + "Hello");
		System.out.println("Hello" + 7 + 8);

		// 自动类型转换(隐式类型转换)
		float a = 5 + 5.0f;
		System.out.println(a);

		// 强制类型转换(显示类型转换)
		char c1 = 'A';
		int c2 = (int)c1;
		System.out.println(c2);

		// 注意: 大范围类型的数据转换成小范围类型的数据时, 需要注意溢出问题
		int num = 128;
		byte b = (byte)num;
		System.out.println(b);

		// boolean类型的数组无法转换成其它类型的数据
		/*
		boolean flag = true;
		System.out.println((int)flag);
		*/

	}

}