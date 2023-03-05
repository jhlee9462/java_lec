package ex7;

public class Calc {

	public double getSum(int data) throws InvalidException {
		if (data < 2 || data > 5)
			throw new InvalidException();
		
		return (data + 1) * data / 2.0;
		
	}
}
