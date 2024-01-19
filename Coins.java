public class Coins {
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int q = m/25;
		int c = m%25;
		System.out.println("Use " + q + " quaters and " + c + " cents");
	}
}
