public class Student1 {

	int age;
	int score;
	String name;
	String gender;

	public void eat(){
		System.out.println("我叫" + name + ",性别" + gender + ",年龄" + age + "分数" + score);
	}
	public static void main(String[] args) {

		Student1 a1 = new Student1();
		a1.name = "小刚";
		a1.age = 18;
		a1.gender = "男";
		a1.score = 80;


		Student1 a2 = new Student1();
		a2.name = "小红";
		a2.age = 19;
		a2.gender = "女";
		a2.score = 85;

		Student1 a3 = new Student1();
		a3.name = "小强";
		a3.age = 21;
		a3.gender = "男";
		a3.score = 91;

		Student1 a4 = new Student1();
		a4.name = "小丽";
		a4.age = 20;
		a4.gender = "女";
		a4.score = 70;

		Student1[] arr = {a1, a2, a3, a4};

		for (int i = 0; i < arr.length - 1; i++){ 
			for (int j = 0; j < arr.length - 1 - i; j++){
				if (arr[j].score < arr[j+1].score){
					Student1 temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++){
			Student1 a = arr[i];
			a.eat();
		}

	}
}





