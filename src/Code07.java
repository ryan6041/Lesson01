
public class Code07 {

	public static void main(String[] args) {

		int[] grades = new int[5];

		grades[0] = 100;
		grades[1] = 80;
		grades[2] = 70;
		grades[3] = 50;
		grades[4] = 20;

		int i = 0;
		while(i < grades.length) {
			System.out.println("Grades "+(i+1)+": " + grades[i]); i++;	
		}

	}

}
