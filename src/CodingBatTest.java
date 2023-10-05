
public class CodingBatTest {

	public static void main(String[] args) {
		System.out.println(fizzString("dig"));

	}

	
	public static String fizzString(String str) {
		//Does it start with f and end with b
		if (str.startsWith("f")&& str.endsWith("b")) {
			//return "FizzBuzz"
			return "FizzBuzz";
		}
		//Does it start with f
		else if (str.startsWith("f")) {
			//return Fizz
			return "Fizz";
		}
		//Does it end with b
		else if (str.endsWith("b")) {
			//return Buzz
			return "Buzz";
		}
		//return str
		else {
			return str;
		}
	}

}
