package q02.personSubClassCreate;

public class Staff extends Employee {

	private String title;
	
	public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return ("name = " + getName() + ", address = " + getAddress() + ", phoneNo = " + getPhoneNo() + ", email = " + getEmail()
		+ ", office = " + getOffice() + ", salary = " + getSalary() + ", title = " + getTitle());
	}
	
}
