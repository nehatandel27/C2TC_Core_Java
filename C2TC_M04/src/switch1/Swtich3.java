package switch1;

public class Swtich3 {
	public static void main(String[] args) {
		int x = 10;

		switch (x + 1) {
		case 10:
			System.out.println(10);
			break;
		case 11:
			System.out.println(11);
			break;
		case 100 + 200:
			System.out.println(300);
			break;
		}
	}
}
