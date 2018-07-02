public class Overload {

	static int sum(int a, int b) {
		System.out.println("int类型");
		return a + b;
	}

	// sum(int, int)
	// static float sum(int b, int a) {
	// 	return a + b;
	// }

	// 方法重载, 两同一不同
	// 同类中
	// 方法名相同
	// 参数个数不同或类型不同或顺序不同
	// 注意: 跟返回值类型无关
	static int sum(int a, int b, int c) {
		System.out.println("3个整型");
		return a + b + c;
	}

	static float sum(float a, float b) {
		System.out.println("float类型");
		return a + b;
	}

	// sayHello(String, int);
	static String sayHello(String name, int a) {
		return name + a;
	}

	// sayHello(int, String)
	static String sayHello(int a, String name) {
		return name + a;
	}

	public static void main(String[] args) {

		// float num = sum(5f, 6f);
		// System.out.println(num);

		// double a = 4e20 + 5E10;
		// System.out.println(a);

		// byte n1 = 5;
		// short n2 = n1;
		short n3 = 5;
		byte n4 = (byte)n3;


	}
}