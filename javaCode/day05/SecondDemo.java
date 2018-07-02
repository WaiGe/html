// 练习1: 输入一个年份, 如果该年份是闰年就结束循环, 否则继续输入
// 练习2: 输入密码, 如果正确提示输入正确, 否则继续输入, 如果输入错误超过三次, 就提示密码输入错误次数过多, 请明天再来
import java.util.Scanner;
public class SecondDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		while (true) {
			int year = sc.nextInt();
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("输入的闰年!");
				break;
			}
			System.out.println("请输入一个年份:");
		}

		// 设置密码
		int code = 1234;
		int n = 1;
		System.out.println("请输入您的密码:");
		while (n <= 3) {

			int num = sc.nextInt();
			if (num == code) {
				System.out.println("密码正确!");
				break;
			} else {
				System.out.println("密码输入错误");
				if (n == 3) {
					System.out.println("密码输入错误次数过多, 请明天再来!");
					break;
				}
				n++;
			}
			System.out.println("请输入您的密码:");
		}


		int sumOdd = 0;
		int sumEven = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				sumOdd += i;

			} else {
				sumEven += i;
				
			}
			i++;
			
		}
		System.out.println("奇数的和为:" + sumOdd + ", 偶数的和为:" + sumEven);

		// do...while 循环适用于代码至少执行一次的场景
		/*
			do {
				循环体
			} while (bool表达式)
	
		*/

	}



}