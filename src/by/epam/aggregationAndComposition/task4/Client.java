package by.epam.aggregationAndComposition.task4;

import java.util.Arrays;

public class Client {
	private final int DEFAULT = 3;
	private String name;
	private Account[] accounts;

	{
		accounts = new Account[DEFAULT];
	}

	public Client(String name) {
		this.name = name;
	}

	public void addAccount(Account account) {
		if (account != null) {
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] == null) {
					accounts[i] = account;
					break;
				}
			}
		}
	}

	public void removeAccount(Account account) {
		if (account != null) {
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null && accounts[i].equals(account)) {
					accounts[i] = null;
					break;
				}
			}
		}
	}

	public Account getAccountByName(String name) {
		Account account = null;
		if (name != null) {
			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i].getAccountName().equals(name)) {
					account = accounts[i];
					break;
				}
			}
		}
		return account;
	}

	public void sort() {
		for (int i = accounts.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (accounts[j].getBalance() > accounts[j + 1].getBalance()) {
					Account tmp = accounts[j];
					accounts[j] = accounts[j + 1];
					accounts[j + 1] = tmp;
				}
			}
		}
	}

	public double getTotalSum() {
		double sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i].getBalance();
		}
		return sum;
	}

	public double getPositiveSum() {
		double sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > 0) {
				sum += accounts[i].getBalance();
			}
		}
		return sum;
	}

	public double getNegativeSum() {
		double sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() < 0) {
				sum += accounts[i].getBalance();
			}
		}
		return sum;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public String getClientName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accounts);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (!Arrays.equals(accounts, other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", accounts=" + Arrays.toString(accounts) + "]";
	}
}
