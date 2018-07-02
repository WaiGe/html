public class X{
	public static void main(String[] args){
		int[] arr = {2,5,1,7};
		x(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void x(int[] arr){
		for(int i = 0; i < arr.length-1; i++){
			int minInder = i;
			for(int j = 1 + i; j < arr.length; j++){
				if (arr[minInder] > arr[j]){
					minInder = j;
				}
			}
			if(minInder != i){
				int temp = arr[i];
				arr[i] = arr[minInder];
				arr[minInder] = temp;
			}
		}
	}
}