package by.epam.aggregationAndComposition.task5;

import java.util.Arrays;

public class TouristAgency {
	private final int DEFAULT = 2;
	private String name;
	private Client[] clients;

	{
		clients = new Client[DEFAULT];
	}

	public TouristAgency() {
		this.name = "Undefined";
	}

	public TouristAgency(String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException("Tourist agency must have a name");
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

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TouristAgency [name=" + name + ", clients=" + Arrays.toString(clients) + "]";
	}
}
