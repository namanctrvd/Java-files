import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int x = random.nextInt(6)+1; // generates random number between 1-6
		double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println("x = "+x+"\ny = "+y+"\nz = "+z);

	}

}