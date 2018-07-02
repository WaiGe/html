public class Student {

	String name;
	boolean isFee;
	public void fee() {
		isFee = true;
		System.out.println(name + "缴费成功!");
	}

	public static void main(String[] ars) {

		Student stu1 = new Student();
		stu1.name = "小明";
		stu1.isFee = false;

		Student stu2 = new Student();
		stu2.name = "小花";
		stu2.isFee = true;

		Student stu3 = new Student();
		stu3.name = "小强";
		stu3.isFee = false;

		// 存放学生的数组
		// Student[] stuArr = new Student[]{stu1, stu2, stu3};
		Student[] stuArr = {stu1, stu2, stu3};

		for (int i = 0; i < stuArr.length; i++) {
			Student s = stuArr[i];
			// 如果没有缴费
			if (!s.isFee) {
				// 调用缴费方法
				s.fee();
			}
			System.out.println(s.isFee);
		}

		// int[] arr = {1, 2, 3};
		// for (int i = 0; i < arr.length; i++) {
		// 	int num = arr[i];
		// }


	}

}