
public class Complex {

	private int real;
	private int imaginary;

	public Complex(int real, int imaginary) {

		this.real = real;
		this.imaginary = imaginary;

	}

	public int getreal() {
		return real;
	}

	public int getimaginary() {
		return imaginary;
	}

	@Override
	public boolean equals(Object obj) {
		Complex c = (Complex) obj;
		return (c.getreal() == this.getreal() && c.getimaginary() == this.getimaginary());

	}

	@Override
	public int hashCode() {
		return 12 * imaginary + 12 * real;

	}

}
