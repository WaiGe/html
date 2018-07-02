public class Student {

	// static修饰的字段和方法属于类
	static int n = 0;

	// 没有用static修饰的成员属于对象
	public int age;

	// 类的方法
	public static int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// 在静态方法中不能直接使用非静态成员变量
		// System.out.println(age);
		System.out.println(n);
		System.out.println(Student.n);
		System.out.println(Student.sum(5, 6));
		System.out.println(sum(20, 30));

		// 匿名对象
		// 静态方法, 对象也可以调用
		System.out.println(new Student().sum(5, 20));


	} 


}