package labs.Lab2;

public class SimpleCLass {
	private int value;
	private static int numberOfInst;

	public SimpleCLass(int number) {
		value = number;
		numberOfInst++;
	}

	public static int getNumberOfInst() {
		return numberOfInst;
	}

	public static void setNumberOfInst(int numberOfInst) {
		SimpleCLass.numberOfInst = numberOfInst;
	}

	public String toString() {
		return "" + value;
	}

	public void incr() {
		value++;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
