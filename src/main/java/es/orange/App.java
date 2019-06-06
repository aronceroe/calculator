package es.orange;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static int add(String nums) {

		String[] nums_arr = nums.split(",");
		int suma = 0;
		for (String unNum : nums_arr) {
			suma += unNum.trim().equals("") ? 0 : Integer.parseInt(unNum.trim());
		}
		return suma;

	}

}
