package garage;

public class Motorbike extends Vehicle {

	protected String capacity;

	public Motorbike(String vehicleName, String size, int age, String model) {
		super(vehicleName, size, age, model);
		setCapacity(capacity);

	}

	private void setCapacity(String capacity) {
		this.capacity = setCapacity;
	}
	
	@Override
	public void vehicleCost() {
		System.out.println(10000);
	}
}
