package springmvc;

public class User {

	private String username;
	private String password;
	private Address address;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", address=" + address + "]";
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
