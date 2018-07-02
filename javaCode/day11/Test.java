//输入日期判断是年份中的那一天.
import java.util.Scanner;
public class Test{
	static boolean Year(int year) {
		if (year % 4 ==0 && year % 100 != 0 || year % 100 == 0) {
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = sc.nextInt();
		System.out.println("请输入月份");
		int month = sc.nextInt();
		while(month>12) {
			System.out.println("输入有误,请重新输入");
			month = sc.nextInt();
		}
		System.out.println("请输入日期");
		int date = sc.nextInt();
		switch(month){
			case 1: 
			case 3: 
			case 5: 
			case 7: 
			case 8: 
			case 10: 
			case 12: while(date>31){
				System.out.println("输入有误,请重新输入");
				date = sc.nextInt();
			}
			break;
			case 4:
			case 6:
			case 9:
			case 11:while(date>30) {
					System.out.println("输入有误,请重新输入");
					date = sc.nextInt();
				}
				break;
			case 2: if (Year(year) == true) {
				while(date>29) {
					System.out.println("输入有误,请重新输入");
					date = sc.nextInt();
				}
			} else {
				while(date>28) {
					System.out.println("输入有误,请重新输入");
					date = sc.nextInt();
				}
			}
		}
		int[] arrA = {31, 29, 31, 30, 31, 30 ,31 ,31 ,30, 31, 30 ,31};
		int[] arrB = {31 ,28, 31, 30 ,31, 30 ,31, 31 ,30 ,31, 30 ,31};
		int[] arrC = {};
		int sum = 0;
		if (Year(year) == true) {
			arrC = arrA;
		}else{
			arrC = arrB;
		}
		for (int i = 0; i < month - 1 ; i++) {
			sum += arrC[i];
		}
		sum += date;
		System.out.println("该天是该年的第" + sum + "天");

	}
}