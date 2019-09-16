import java.util.Scanner;

public class Code09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Type how many interger you want to insert");
		int n = kb.nextInt(); //n개 정수 입력받고
		
		System.out.println("Type intergers");
		int data[] = new int[n]; // 배열만들고
		
		for (int i = 0; i<n; i++) //배열에 저장하고
			data[i]= kb.nextInt();
		kb.close();
		
		int tmp = data[n-1]; //배열 맨마지막 값 다른데 keep
		
		for(int i = n-2; i>=0; i--) {
			data[i+1] = data[i];
		}
		data[0] = tmp;
		
		for (int i = 0; i<n; i++)
			System.out.println(data[i]);
		
	
	}

}
