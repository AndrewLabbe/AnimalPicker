import java.util.Scanner;

public class Animal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What animal would you like to see: a dog or a cat?");
		String res = sc.nextLine();
		
		if(res.toLowerCase().contains("cat")) {
			System.out.println("CAT ASCII ART HERE.");
		}
		else {
			System.out.println("DOG ASCII ART HERE.");
		}
	}
	
}
