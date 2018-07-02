public class Animal {

	static int n = 0;
	String type;
	int age;


	public static void main(String[] args) {

		// 实例化一个对象猫
		Animal cat = new Animal();
		cat.type = "猫";
		cat.age = 3;

		// 实例化一个对象狗
		Animal dog = new Animal();
		dog.type = "狗";
		dog.age = 20;


		System.out.println(cat.age);
		System.out.println(dog.age);
		cat.age = 30;

		System.out.println(cat.age);
		System.out.println(dog.age);

		System.out.println("=========");
		System.out.println(cat.n);
		System.out.println(dog.n);

		// 通过该类创建出来的所有对象都可以访问类成员变量
		// 类成员变量是一块共享区域
		// 通过一个对象修改类成员变量的值, 其它对象访问该成员变量时都会改变
		cat.n = 56;
		System.out.println(cat.n);
		System.out.println(dog.n);

		// 类成员变量一般用 类.成员变量名 来访问, 在当前类中, 类名可以省略
		System.out.println(Animal.n);
		System.out.println(n);

		Animal bird = new Animal();
		bird2 = bird;
		// 当指向该内存的对象的个数为0时(引用计数为0), 该内存会被系统回收(GC垃圾回收机制)
		bird = null;
		bird2 = null;



	}

}