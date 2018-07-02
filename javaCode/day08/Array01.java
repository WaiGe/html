public class Array01 {
	static int num;
	public static void main(String[] args) {



		// 数组, 存放大量相同数据的有序集合
		int[] arr = {100, 58, 95, 80};

		// 访问数组中元素的方法
		// 数组名[下标]
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[3]);

		int a = 20;
		int b = 30;
		int c = 40;
		int[] arr2 = {a, b, c};
		System.out.println(arr2[2]);


		String[] strArr = {"园园", "金丽", "瑞霞", "吴俊豪"};
		System.out.println(strArr[3]);

		// 修改数组中元素
		strArr[3] = "迪丽热巴";
		System.out.println(strArr[3]);

		// 定义数组
		float score[] = {98f, 87.5f, 32.3f};
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);

		// 分配5个int类型的空间
		int[] ageArr = new int[5];
		System.out.println(ageArr[0]);

		// ageArr[0] = 22;
		// ageArr[1] = 24;
		// ageArr[2] = 30;
		// ageArr[3] = 18;
		// ageArr[4] = 20;
		// ageArr[5] = 60;


		System.out.println(num);



	}


}