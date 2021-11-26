package models;

public class User {
	
	private String fName;
	private String lName;
	private int age;
	private String email;
	private int contactNumber;
	private String city;
	
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", age=" + age + ", email=" + email + ", contactNumber="
				+ contactNumber + ", city=" + city + "]";
	}
	
	

}
