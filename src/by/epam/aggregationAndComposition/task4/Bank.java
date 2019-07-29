package by.epam.aggregationAndComposition.task4;

import java.util.Arrays;

public class Bank {

	private final int DEFAULT = 5;
	private Client[] clients;
	private String name;

	{
		clients = new Client[DEFAULT];
	}

	public Bank() {
		this.name = "Undefined";
	}

	public Bank(String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("Bank must have a name");
		} else {
			this.name = name;
		}
	}

	public void addClient(Client client) {
		if (client != null) {
			for (int i = 0; i < clients.length; i++) {
				if (clients[i] == null) {
					clients[i] = client;
					break;
				}
			}
		}
	}

	public void removeClient(Client client) {
		if (client != null) {
			for (int i = 0; i < clients.length; i++) {
				if (clients[i] != null && clients[i].equals(client)) {
					clients[i] = null;
					break;
				}
			}
		}
	}

	public Client getClientByName(String name) {
		Client client = null;
		if (name != null) {
			for (int i = 0; i < clients.length; i++) {
				if (clients[i].getClientName().equals(name)) {
					client = clients[i];
					break;
				}
			}
		}
		return client;
	}

	public String getBankName() {
		return name;
	}

	@Override
	public String toString() {
		return "Bank [clients=" + Arrays.toString(clients) + ", name=" + name + "]";
	}
}
