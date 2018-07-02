// 引入类库
import java.util.Scanner;

public class FirstDemo {


	public static void main(String[] args) {

		// 选择语句
		/*
			如果条件表达式结果为true就执行语句1
			if (条件表达式) {
				语句1
			}

		*/
		int a = 5;
		if (a % 2 == 0) {
			a += 1;
		}
		System.out.println("a = " + a);

		/*
			if (条件表达式) {
				代码1
			} else {
				代码2
			} 
		*/

		int b = 3;
		if (a > b) {
			System.out.println("a是最大数"); 
		} else {
			System.out.println("b是最大数");
		}
		String str = a > b ? "a是最大数" : "b是最大数";
		System.out.println(str);

		// 创建输入类对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int r = sc.nextInt();
		if (r % 2 == 0) {
			System.out.println("您输入的偶数!");
		} else {
			System.out.println("您输入的时奇数!");
		}

		// 闰年: 能被4整除但不能被100整除 或者 能被400整除的年
		System.out.println("请输入年份:");
		r = sc.nextInt();
		if (r % 4 == 0 && r % 100 != 0 || r % 400 == 0) {
			System.out.println("您输入的年份是闰年!");
		} else {
			System.out.println("您输入的年份是平年!");
		}


	}


}