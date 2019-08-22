package by.epam.classesAndObjects.task8;

public class Customer {

	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private int cardNumber;
	private int BankAccountNumber;

	public Customer(int id, String surname, String name, String patronymic, String address, int cardNumber,
			int bankAccountNumber) {
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.cardNumber = cardNumber;
		BankAccountNumber = bankAccountNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getBankAccountNumber() {
		return BankAccountNumber;
	}

	public void setBankAccountNumber(int bankAccountNumber) {
		BankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", cardNumber=" + cardNumber + ", BankAccountNumber=" + BankAccountNumber
				+ "]";
	}

}
