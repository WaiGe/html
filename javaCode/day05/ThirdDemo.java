import java.util.Scanner;
public class ThirdDemo 
{

	// 入口函数
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名:");
		// 获取输入的一行内容, 返回值为String类型
		String name = sc.nextLine();

		int sum = 0;
		for (int i = 1; i <= 5; i++) {

			System.out.println("请输入第" + i + "科成绩:");
			int score = sc.nextInt();
			sum += score;
		}
		double avg = (double)sum / 5;
		System.out.println(name + "的平均成绩: " + avg);


	}







}