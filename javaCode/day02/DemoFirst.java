public class DemoFirst {

	// 静态全局变量(类的属性)
	static int age = 20;
	// 全局变量(成员变量, 字段)
	int money = 100;


	public static void main(String[] args) {

		// 常量: 程序运行期间值不可以被改变
		// 变量: 表示一个存储空间(容器), 在程序运行期间值可以被改变, 可以被反复使用

		// 定义一个变量
		// 语法:  类型修饰符 变量名 = 值;
		// 定义一个整型的变量
		int a = 5;
		int b = 6, c = 20;
		int d;
		d = 7;
		System.out.println(DemoFirst.age);

		// 创建一个具体的对象
		DemoFirst demo01 = new DemoFirst();
		System.out.println(demo01.money);



	}


}