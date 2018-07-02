import java.util.Scanner;
public class SixthDemo {


	public static void main(String[] args) {

		// 创建一个二维数组
		int[][] scoreArr = new int[3][5];
		// Scanner对象接收录入的值
		Scanner sc = new Scanner(System.in);

		// 一维数组, 存放每个班的总成绩
		int[] totalScore = new int[3];

		for (int i = 0; i < scoreArr.length; i++) {

			System.out.println("请输入第" + (i + 1) + "班的分数:");

			for (int j = 0; j < scoreArr[i].length; j++) {

				System.out.print("第" + (j + 1) + "个人的分数为: ");
				int num = sc.nextInt();
				scoreArr[i][j] = num;

				totalScore[i] += num;
			}

		}


		for (int i = 0; i < totalScore.length; i++) {

			System.out.println("第" + (i + 1) + "班的总分数为: " + totalScore[i]);
			
		}






	}

}