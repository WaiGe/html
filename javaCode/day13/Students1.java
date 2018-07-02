public class Students1{
	String name;
	int age;
	String gender;
	int score;
	public Students1(String name, int age, String gender, int score){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.score = score;
	}
	public void stuInfo(){
		System.out.println("学生的名字: " + name + " 年龄: " + age +
		" 性别: " + gender + " 分数: " + score );
	}

	public static void main(String[] args) {
		Students1 s1 = new Students1("张三", 20, "男", 80);
		Students1 s2 = new Students1("李四", 20, "男", 83);
		Students1 s3 = new Students1("小明", 19, "男", 73);
		Students1 s4 = new Students1("小花", 21, "女", 87);
		Students1[] stuArr = {s1, s2, s3, s4};
		bubleSort(stuArr);
		for(int i = 0; i < stuArr.length; i++){
			stuArr[i].stuInfo();
		}
	}
	public static void bubleSort(Students1[] arr){
		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - 1 - i; j++){
				if(arr[j].age > arr[j+1].age){
					Students1 temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				if(arr[j].age == arr[j+1].age){
					if(arr[j].score > arr[j+1].score){
						Students1 temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] =temp;
					}
				}
			}
		}
	}
}