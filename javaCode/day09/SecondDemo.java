import java.util.Scanner;

public class SecondDemo 
{


	public static void main(String[] args) 
	{

		int[] arr = {8, 4, 2, 1, 23, 344, 12};
		int num = 23;
		System.out.println("请输入一个整数:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		boolean flag = false;
		// 遍历数组
		for (int i = 0; i < arr.length; i++) 
		{
			/*
			if (num == arr[i]) {
				System.out.println("num的下标为: " + i);
			}
			*/

			if (a == arr[i]) 
			{
				flag = true;
				break;
			}

		}

		if (flag) 
		{
			System.out.println("该数存在!");
		} else {
			System.out.println("该数不存在!");
		}


	}

}