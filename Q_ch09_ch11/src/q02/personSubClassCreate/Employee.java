package q02.personSubClassCreate;

public class Employee extends Person {
	private int office;
	private double salary;
	
	public Employee(String name, String address, String phone, String email, int office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
	}

	public int getOffice() {
		return office;
	}

	public void setOffice(int office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return ("name = " + getName() + ", address = " + getAddress() + ", phoneNo = " + getPhoneNo() + ", email = " + getEmail()
		+ ", office = " + getOffice() + ", salary = " + getSalary());
	}
}
