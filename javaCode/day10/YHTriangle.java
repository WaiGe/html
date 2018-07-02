public class YHTriangle {


	public static void main(String[] args) {
		// %d 代表整型数
		// %sd 短整型
		// %s 字符串
		// %f 浮点型
		// %c 字符串
		// 格式化输出函数
		// System.out.printf("ni%dha%.2fo%sma %c %sd", 111, 5.987, "hehe", 'A', 56);
		// System.out.printf("%4d\n", 5);
		// System.out.printf("%4d\n", 1995);

		int[][] arr = new int[10][];
		for (int i = 0; i < arr.length; i++) {
			// 第i个元素的长度
			arr[i] = new int[i+1];

			// 输出空格
			for (int k = 0; k < arr.length - 1 - i; k++) {
				System.out.print("  ");
			}

			for (int j = 0; j < arr[i].length; j++) {

				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
				System.out.printf("%4d", arr[i][j]);

			}
			System.out.println();

		}




	}



}