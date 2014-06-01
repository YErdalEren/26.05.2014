
public class Profosor implements Person {
	private String firstName;
    private String surName;
	
	private int articleNumber;
	private String position;
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
	public int getArticleNumber() {
		return articleNumber;
	}
	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
}
