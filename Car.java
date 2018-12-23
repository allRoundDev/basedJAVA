package dada;

public abstract class Car {
	private String name;
	private double prise;
	public Car(String name,double prise) {
		this.name=name;
		this.prise=prise;
	}
	public abstract String carry();
	public void setterName(String name) {
		this.name =name;
	}
	public String getterName() {
		return name;
	}
	public void setterPrise(double prise) {
		this.prise=prise;
	}
	public double getterPrise() {
		return prise;
	}
}
