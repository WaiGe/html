public class Person {

	// Java语言严格区分大小写

	// 一个Java源文件里可以定义多个Java类, 但其中最多只能有一个类被定义为public类. 若源文件中包括了public类, 源文件必须和该public类同名

	// 一个源文件中包含N个Java类时, 编译后会生成N份字节码文件, 即每个类都会生成一份单独的class文件, 并且字节码文件名和其对应的类名相同

	// 一个类必须拥有main方法才能运行, 以为main方法是程序的入口

	// 单行注释

	/*
		多行注释
	*/

	/**
	 * 1. 文档注释	
	 * 2. 和多行注释一样, 还可以专门生成文档信息API
	*/

	// javadoc命令生产成API文档和文档注释
	// javadoc -d 目录 java源程序
	// 例如: javadoc -d Person Person.java

	public static void main(String[] args) {
		// 创建一个猫
		// Cat c1 = new Cat();
		// c1.info();

		// 标识符命名规则
		// Java所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。
		// 1. 由数字, 字母, 下划线, $组成, 但是不能以数字开头
		// 2. 大小写敏感
		// 3. 不得使用java中的关键字和保留字
		// 4. 不用Java API里的类名作为自己的类名

		// 作业: 预习循环,分支,类型修饰符

		int data = 5;
		System.out.println(data);
	}

}

class Cat {
	String type = "波斯猫";
	int age = 1;
	public void info() {
		System.out.println("我是" + type + ", 我今年" + age + "岁了!");
	}
}