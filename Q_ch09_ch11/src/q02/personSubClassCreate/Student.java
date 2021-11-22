package q02.personSubClassCreate;

public class Student extends Person {
	private int status;
	private final int FRESHMAN = 1;
	private final int SOPHOMORE = 2;
	private final int JUNIOR = 3;
	private final int SENIOR = 4;
	
	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public int getStatus() {

		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return ("name = " + getName() + ", address = " + getAddress() + ", phoneNo = " + getPhoneNo() + ", email = " + getEmail()
		+ ", status = " + getStatus());
	}
}
