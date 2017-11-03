
public class User {
	
	private String id;
	private String role;
	private String name;
	private String email;
	private String adress;
	
	
	
	public User(String pId, String pRole, String pName, String pEmail, String pAdress) {
		id = pId;
		role = pRole;
		name = pName;
		email = pEmail;
		adress = pAdress;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
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



	public String getAdress() {
		return adress;
	}



	public void setAdress(String adress) {
		this.adress = adress;
	}
}
