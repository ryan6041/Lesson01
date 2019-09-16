
public class Code06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] grades = new int[5];
		 
		grades[0] = 100;
		grades[1] = 80;
		grades[2] = 70;
		grades[3] = 50;
		grades[4] = 20;
		
		for(int i = 0 ; i < grades.length; i++) {
			System.out.println("Grade " + (i+1) + ": " + grades[i]);
		}
	}

}
