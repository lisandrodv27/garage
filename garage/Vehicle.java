package garage;

public class Vehicle {

	// attributes
	protected String vehicleName;
	protected String size;
	protected int age;
	protected String model;

	public Vehicle() {
		super(); // class object constructor
	}

	public Vehicle(String vehicleName, String size, int age, String model) {
		super();
		this.vehicleName = vehicleName;
		this.size = size;
		this.age = age;
		this.model = model;
	}

	// Methods

	public void vehicleCost() { // double?
		System.out.println(1000);
		
	}

	// setter & getters

	public String getName() {
		return vehicleName;
	}

	public void setName() {
		this.vehicleName = vehicleName;
	}

	public String getSize() {
		return size;
	}

	public void setSize() {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getModel() {
		return model;
	}

	public void setModel() {
		this.model = model;
	}

}
