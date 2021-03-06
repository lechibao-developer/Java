package branching;

public class BreakStament {

	public void unlabeledBreakStament() {
		int out, in = 0;
		for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break;
			}
			System.out.println("inside the outer loop: out = " + out + ", in = " + in);
		}
		System.out.println("end of the outer loop: out = " + out + ", in = " + in);

	}

	public void labeledBreakStament() {
		int out, in = 0;
		outer: for (out = 0; out < 10; out++) {
			for (in = 0; in < 20; in++) {
				if (in > 10)
					break outer;
			}
			System.out.println("inside the outer loop: out = " + out + ", in = " + in);
		}
		System.out.println("end of the outer loop: out = " + out + ", in = " + in);

	}

	public static void main(String[] args) {
		BreakStament bs = new BreakStament();
		bs.unlabeledBreakStament();
		bs.labeledBreakStament();
	}
}
