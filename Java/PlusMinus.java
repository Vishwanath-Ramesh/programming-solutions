import java.util.*;
class PlusMinus{
	public static void main(String[] args){
		int positive = 0,negative = 0,zero = 0;
		Scanner scanner = new Scanner(System.in);
		int array_range = scanner.nextInt();
		int array[] = new int[array_range];
		for(int i = 0;i < array_range;i++){
			array[i] = scanner.nextInt();
			if(array[i] > 0)
				positive += 1;
			if(array[i] < 0)
				negative += 1;
			if(array[i] > 0)
				zero += 1;
		}
		System.out.printf("%.6f",(positive/array_range));
		System.out.printf("%.6f",(negative/array_range));
		System.out.printf("%.6f",(zero/array_range));
	}
}
			