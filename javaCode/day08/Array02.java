public class Array02 {


	public static void main(String[] args) {


		// 遍历数组
		int[] arr = {2, 3, 6, 9, 20, 39, 98};
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		*/

		// length: 数组的元素的个数
		// System.out.println(arr.length);

		// 通过for循环遍历数组
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}

		// 将数组arr中的元素放入到arr2中
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			arr2[i] = arr[i] * 2;
		}

		for (int i = 0; i < arr2.length; i++) {

			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}

		System.out.println("数组的最后一个元素为: " + arr2[arr2.length - 1]);

	}


}