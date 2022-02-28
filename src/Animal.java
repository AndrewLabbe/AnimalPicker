import java.util.Scanner;

public class Animal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean bool = false;
		while (!bool) {
			System.out.println("What animal would you like to see: a dog or a cat?");
			String res = sc.nextLine();
			
			if(res.toLowerCase().contains("cat")) {
				System.out.println("CAT ASCII ART HERE.");
				bool = true;
			}
			else if (res.toLowerCase().contains("dog")){
				System.out.println("DOG ASCII ART HERE.");
				bool = true;
			}
			else {
				System.out.println("Error: Invalid option");
			}
		}
	}
	
}
