import java.util.Scanner;
public class Caculator {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("请输入第一个数:");
			float n1 = 0, n2 = 0, result = 0;
			String operate;
			boolean flag = true;
			// 判断输入的是否是整型
			if (sc.hasNextInt()) {
				n1 = (int)sc.nextInt();

			// 判断是输入的是否是浮点型
			} else if (sc.hasNextFloat()) {
				n1 = sc.nextFloat();
				flag = false;
			}

			System.out.println("请输入要做的运算:");
			operate = sc.next();

			System.out.println("请输入第二个数:");
			// 判断输入的是否是整型
			if (sc.hasNextInt()) {
				n2 = (int)sc.nextInt();

			// 判断是输入的是否是浮点型
			} else if (sc.hasNextFloat()) {
				n2 = sc.nextFloat();
				flag = false;
			}

			switch (operate) {
				case "+":
					if (flag) {
						result = sum((int)n1, (int)n2);
					} else {
						result = sum(n1, n2);
					}
					
					break;
				case "-":
					if (flag) {
						result = sub((int)n1, (int)n2);
					} else {
						result = sub(n1, n2);
					}
					break;
					default: 
						break;

			}	
			System.out.println(flag);
			if (flag) {
				System.out.println("结果为:" + (int)result);
			}  else {
				System.out.println("结果为:" + result);
			}
			


		}



	}
	public static int sum(int a, int b) {
		return a + b;
	}

	public static float sum(float a, float b) {
		return a + b;
	}


	public static int sub(int a, int b) {
		return a - b;
	}

	public static float sub(float a, float b) {
		return a - b;
	}




}