package banco;

public class NumeroComplejo {

	private double r;
	private double i;
	
	public NumeroComplejo(double r, double i) {
		this.r = r;
		this.i = i;
	}
	
	public double norm() {
		return Math.sqrt(r*r+i*i);
	}
}
