package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class client {

	private String name;
	private String email;
	private Date BirthDate;

	public client() {
	}
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		BirthDate = birthDate;
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

	public Date getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(Date birthDate) {
		BirthDate = birthDate;
	}
	public String toString() {
		return name + " (" + sdf.format(BirthDate) + ") - " + email;
 	}
}
