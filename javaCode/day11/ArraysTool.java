import java.util.Arrays;
public class ArraysTool {


	public static void main(String[] args) {

		// 注意: 需要在已经排好序的数组中进行查询
		byte[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11};
		byte n = 2;

		// 查找元数据
		int r = Arrays.binarySearch(arr, n);
		System.out.println(r);
		r = Arrays.binarySearch(arr, 0, 1, n);
		System.out.println(r);

		byte[] arrA = Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(arrA));

		int[] arrB = {7, 8, 25, 78, 9, 21, 5, 3};
		Arrays.sort(arrB, 3, 6);
		System.out.println(Arrays.toString(arrB));

		System.out.println(Arrays.hashCode(arrB));
	}

	// 作业: 计算器
	// 作业2: 算法 抄10遍



}