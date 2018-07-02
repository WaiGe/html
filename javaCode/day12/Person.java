// class是类的意思
// public 公共的(访问限制修饰符)
// 类是具有相同特征和行为的事物的抽象
public class Person {

	// 实例的成员变量(字段)
	// 年龄
	int age;

	// 性别
	String gender;

	// 姓名
	String name;

	// 方法
	public void eat() {
		System.out.println("我的名字叫" + name + ", 性别:" + gender + ", 年龄:" + age + ", 喜欢蘸着吃!");
	}



	public static void main(String[] args) {

		// 初始化一个对象
		// 对象是类的实例化(具体化)
		// 类名 变量名 = new 类名();
		Person p1 = new Person();
		// 通过 .语法 可以访问对象的属性和方法
		// 设置值
		p1.age = 26;
		p1.gender = "保密";
		p1.name = "元中华";
		
		
		// 调用方法
		p1.eat();

		Person p2 = new Person();
		p2.name = "王迪";
		p2.age = 22;
		p2.gender = "男";
		p2.eat();



	}


}







