import java.util.Scanner;

public class Code08 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		System.out.println("Type how many interger you want to insert");
		int n = kb.nextInt();
		
		System.out.println("type intergers");
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
			data[i] = kb.nextInt();
		
		int sum = 0;
		int max = data[0];
		for (int i = 0; i<n; i++) {
			sum += data[i]; //sum = sum + data[i];
			if(data[i] > max)
				max = data[i];
		}
				
		System.out.println("The sum is : "+sum);
		System.out.println("The max is : "+max);
		kb.close();

	}

}
