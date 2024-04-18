
public class Student {

	private String firstName;
	private String lastName;
	private String currentAddress;
	private String homeAddress;
	private String stuPhoneNumber;
	private String gpa;
	
	public Student(String firstName, String lastName, String currentAddress, String homeAddress, String stuPhoneNumber, String gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentAddress = currentAddress;
        this.homeAddress = homeAddress;
        this.stuPhoneNumber = stuPhoneNumber;
        this.gpa = gpa;
    }
	
	public void setFirstName(String firstName) {
	      this.firstName = firstName;
	   }
	   
	public void setLastName(String lastName) {
	      this.lastName = lastName;
	   }
	   
	public void setCurrentAddress(String currentAddress) {
	      this.currentAddress = currentAddress;
	   }
	   
	public void setHomeAddress(String homeAddress) {
	      this.homeAddress = homeAddress;
	   }
	
	public void setStuPhoneNumber(String stuPhoneNumber) {
	      this.stuPhoneNumber = stuPhoneNumber;
	   }
	
	public void setGPA(String gpa) {
	      this.gpa = gpa;
	   }
	
	public String getFirstName() {
	      return firstName;
	   }
	   
	public String getLastName() {
	      return lastName;
	   }
	
	public String getCurrentAddress() {
	      return currentAddress;
	   }
	
	public String getHomeAddress() {
	      return homeAddress;
	   }
	
	public String getStuPhoneNumber() {
	      return stuPhoneNumber;
	   }
	
	public String getGPA() {
	      return gpa;
	   }
	
	public String toString() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Current Address: " + currentAddress + "\n" +
                "Home Address: " + homeAddress + "\n" +
                "Phone Number: " + stuPhoneNumber + "\n" +
                "GPA: " + gpa;
    }
	
	
	

}
