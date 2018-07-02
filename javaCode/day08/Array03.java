public class Array03 {


	public static void main(String[] args) {

		// System.out.println(args[1]);

		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {5, 6, 7, 8};
		// 获取数组的长度
		int length = arr1.length;

		int[] arr3 = new int[length];

		for (int i = 0; i < length; i++) {

			arr3[i] = arr1[i] + arr2[i];
			System.out.println("arr3[" + i + "]=" + arr3[i]);

		}

		int[] arr4 = new int[length];
		for (int i = 0; i < length; i++) {
			// arr4[0] = arr3[3]
			// arr4[1] = arr3[2]
			// arr4[2] = arr3[1]
			// arr4[3] = arr3[0]
			arr4[i] = arr3[length - 1 - i];
		}

		// 作业: 学过的代码敲一遍
		// 拓展题: 如何交换两个变量的值, 如何交换数组中两个位置上的元素的值?
		// 拓展题: 通过控制台输入数字并把数字放到数组中, 求这个数组中所有元素的和,所有元素的最大数和最小数, 所有元素的平均值
		// 乘法口诀表10遍

	}

}