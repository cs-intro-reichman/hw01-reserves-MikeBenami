public class GenThree {
	public static void main(String[] args) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			double c = Math.random();
			int d = (int)(c*(b-a)+a);
		        System.out.println(d);
			double f = Math.random();
			int e = (int)(c*(b-a)+a);
			System.outprintln(e)
			double g = Math.random();
			int h = (int)(c*(b-a)+a);
			System.out.println(h);
			int i = Math.min(d, e, h);
			System.out.println("The minimal generated number was " + i);
	}
}
