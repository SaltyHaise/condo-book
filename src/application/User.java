package application;

public class User {
	private String name;
	private String password;
	private int UnitNo;
	private int CardNo;
	private int CVV;

	public User(String name, String password, int UnitNo, int CardNo, int CVV) {
		this.name = name;
		this.password = password;
		this.UnitNo = UnitNo;
		this.CardNo = CardNo;
		this.CVV = CVV;

	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitNo() {
		return UnitNo;
	}

	public void setUnitNo(int unitNo) {
		UnitNo = unitNo;
	}

	public int getCardNo() {
		return CardNo;
	}

	public void setCardNo(int cardNo) {
		CardNo = cardNo;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

}
