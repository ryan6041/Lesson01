import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {

		String str = "Hello";
		String input = null;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please Type a String : ");
		input = keyboard.next();
		if(str == input) {  //���⼭ ==�����ڴ� String ���� �񱳰� �ȵȴ�. ������ �ؾ��ϳ�? str.equals(input)���� �ؾ���
			System.out.println("String Correct");
		} else {
			System.out.println("String do not correct");
		}
		
		keyboard.close();



	}

}
