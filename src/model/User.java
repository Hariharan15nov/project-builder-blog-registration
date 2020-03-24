package model;
import java.time.LocalDate;; 
class User{
	String name;
	String email;
	LocalDate date;
	User(String name,String email,LocalDate date){
		this.name=name;
		this.email=email;
		this.date=date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}	
}