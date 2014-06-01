
public class Student implements Person {

	private String firstName;
    private String surName;
    
	private String major;
	private int no;
	@Override
	public String getFirstname() {
		// TODO Auto-generated method stub
		return this.firstName;
	}
	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return this.surName;
	}
	@Override
	public void setFirstname(String S) {
		// TODO Auto-generated method stub
		this.firstName=S;
		
	}
	@Override
	public void setSurname(String S) {
		// TODO Auto-generated method stub
		this.surName=S;
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
}
