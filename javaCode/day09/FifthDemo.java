public class FifthDemo {

	public static void main(String[] args) {

		int[][] score = {
			{88, 92, 95, 100},
			{90, 95, 67, 60, 32},
			{66, 74, 32, 80}
		};

		// 遍历二维数组
		for (int i = 0; i < score.length; i++) {

			// score[0]
			// score[1]
			// score[2]
			System.out.println("第" + (i + 1) + "排的分数:");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();

		}


	}


}