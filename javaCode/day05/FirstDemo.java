import java.util.Scanner;
public class FirstDemo {


	public static void main(String[] args) {

		int i = 0;
		while (i < 100) {

			System.out.println("打印第" + (i + 1) + "份试卷");
			i++;
		}

		i = 1;
		while (i <= 100) {

			if (i % 7 == 0) {
				i++;
				// 立即结束本次循环
				// continue下面的代码不会再执行
				continue;
			}
			System.out.print(i + " ");
			i++;

		}

		System.out.println("请输入一个整数:");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			if (num / 10 == 7 || num % 10 == 7) {
				System.out.println("Over!");
				// 立即结束本层循环
				// 下面代码不再执行
				break;
			}
			System.out.println("请您继续输入一个整数:");
		}



	}


}