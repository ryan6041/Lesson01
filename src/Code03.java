import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {

		String str = "Hello";
		String input = null;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please Type a String : ");
		input = keyboard.next();
		if(str == input) {  //여기서 ==연산자는 String 으로 비교가 안된다. 어떤방식을 해야하나? str.equals(input)으로 해야함
			System.out.println("String Correct");
		} else {
			System.out.println("String do not correct");
		}
		
		keyboard.close();



	}

}
