public class Animal02 {

	int age = 2;
	String type = "鸟";

	void fly() {
		// 方法内部变量(局部变量)
		int a = 6;
		System.out.println("我会飞!");
		System.out.println(age);
		System.out.println(type);
		// System.out.println(a);
	}

	// args 方法参数
	public static void main(String[] args) {

		Animal02 bird = new Animal02();
		System.out.println(bird.age);
		System.out.println(bird.type);
		bird.fly();

		// 作用域: 变量生效的范围(从定义变量开始一直到变量所在花括号结束) 
		// int a = 5;

		int b = 2;
		int b = 3;
		


	}

}