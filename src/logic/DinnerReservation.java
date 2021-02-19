package logic;

public class DinnerReservation {

	private String surname;
	
	private String dinnerTime;
	
	private String date;
	
	private String mobile;
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public void setDinnerTime(String dinnerTime) {
		this.dinnerTime = dinnerTime;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public boolean makeReservation() {
		
		return (mobile.length() == 10);
	}
}
