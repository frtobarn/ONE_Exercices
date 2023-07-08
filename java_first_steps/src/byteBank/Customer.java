package byteBank;

public class Customer implements Logeable {
	private String name;
	private String id;
	private String phone;
	private Address address;
	private String occupation;
	private Account account;

	private AuthTool loginTool;

	public Customer() {
		this.loginTool = new AuthTool();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public boolean login(String password) {
		return this.loginTool.login(password);
	}

	@Override
	public void setPassword(String password) {
		this.loginTool.setPassword(password);

	}

}
