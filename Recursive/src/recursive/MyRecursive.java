package recursive;

public class MyRecursive {

	/*
	 * String.format("%8s", binaryStr).replace(' ', '0')
	 */
	public void decimalToBinary(int n) {
		if (n == 0)
			return;
		decimalToBinary(n / 2);
		System.out.print(n % 2);
	}

	public int digits(int n) {
		if (n < 10) {
			return 1;
		}
		return digits(n / 10) + 1;
	}

	public void reverse(int n) {
		if (n == 0)
			return;
		System.out.print(n % 10);
		reverse(n / 10);
	}

	public static void main(String[] args) {
		MyRecursive mr = new MyRecursive();
		System.out.println("convert decimal to binary:");
		mr.decimalToBinary(89);

		System.out.println();

		System.out.println("digits:");
		System.out.println(mr.digits(100));

		System.out.println("reverse:");
		mr.reverse(123456789);
	}
}
