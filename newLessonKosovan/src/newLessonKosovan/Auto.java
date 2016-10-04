package newLessonKosovan;

public class Auto {
	private String brand;
	private Engine motor;
	public Auto(String brand, Engine motor) {
		super();
		this.brand = brand;
		this.motor = motor;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Engine getMotor() {
		return motor;
	}
	public void setMotor(Engine motor) {
		this.motor = motor;
	}
	
	
}
