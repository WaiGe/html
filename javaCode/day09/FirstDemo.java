import java.util.Scanner;

public class FirstDemo {


	public static void main(String[] args) {


		// 交换两个变量的值
		int a, b;
		a = 5;
		b = 10;

		// 第一种方式
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = " + a + ", b = " + b);

		// 第二种方式
		a = 3;
		b = 7;
		// 语句以分号结尾
		// 表达式: 由变量, 常量和运算符组成的一个具有返回值的式子
		a = a + b - (b = a);
		System.out.println("a = " + a + ", b = " + b);


		// 第三种
		a = 12;
		b = 17;
		a = a + b;
		b = a - b;
		a = a - b;


		// 创建数组
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		// 求和
		int sum = 0;
		int min = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入一个整数:");
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;

			if (i == 0) {
				min = num;
				max = num;
			} else {
				min = min > num ? num : min;
				max = max < num ? num : max;
			}
		}

		// 数组中所有元素的和
		System.out.println("数组中所有元素的和: " + sum);
		System.out.println("平均数为: " + (float)sum / 5);
		System.out.println("最大数: " + max);
		System.out.println("最小数: " + min);






	}



}