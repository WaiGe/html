public class Waigeniubi {
	public static void month (int month,int date) {
		if (month == 1) {
			if (date >= 20) {
				System.out.println("水瓶座");
			}else {
				System.out.println("摩羯座");
			}
		}else if (month == 2) {
			if (date >= 19) {
				System.out.println("双鱼座");
			}else {
				System.out.println("水瓶座");
			}
		}else if (month == 3) {
			if (date >= 21) {
				System.out.println("白羊座");
			}else {
				System.out.println("双鱼座");
			}
		}else if (month == 4) {
			if (date >= 20) {
				System.out.println("金牛座");
			}else {
				System.out.println("白羊座");
			}
		}else if (month == 5) {
			if (date >= 21) {
				System.out.println("双子座");
			}else {
				System.out.println("金牛座");
			}
		}else if (month == 6) {
			if (date >= 22) {
				System.out.println("巨蟹座");
			}else {
				System.out.println("双子座");
			}
		}else if (month == 7) {
			if (date >= 23) {
				System.out.println("狮子座");
			}else {
				System.out.println("巨蟹座");
			}
		}else if (month == 8) {
			if (date >= 23) {
				System.out.println("处女座");
			}else {
				System.out.println("狮子座");
			}

		}else if (month == 9) {
			if (date >= 23) {
				System.out.println("天秤座");
			}else {
				System.out.println("处女座");
			}
		}else if (month == 10) {
			if (date >= 24) {
				System.out.println("天蝎座");
			}else {
				System.out.println("天秤座");
			}
		}else if (month == 11) {
			if (date >= 23) {
				System.out.println("射手座");
			}else {
				System.out.println("天蝎座");
			}
		}else if (month == 12) {
			if (date >= 22) {
				System.out.println("摩羯座");
			}else {
				System.out.println("水瓶座");
			}
		}
	}
		public static void main (String[] args){
			month(2,6);
		}















	
}