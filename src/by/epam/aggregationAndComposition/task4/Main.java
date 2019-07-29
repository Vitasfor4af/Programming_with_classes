package by.epam.aggregationAndComposition.task4;

/* Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность
   блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление
   общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и
   отрицательный балансы отдельно. */

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank("Belarusbank");
		bank.addClient(new Client("Vitaliy"));
		bank.addClient(new Client("Fedor"));

		bank.getClientByName("Vitaliy").addAccount(new Account("Roflani4", 1000));
		bank.getClientByName("Vitaliy").addAccount(new Account("Ricardo", 3000));
		bank.getClientByName("Fedor").addAccount(new Account("Somnus", -40));
		bank.getClientByName("Fedor").addAccount(new Account("Sccc", 480));
		bank.getClientByName("Fedor").addAccount(new Account("Irlandu", -2356));

		bank.getClientByName("Fedor").sort();
		for (int i = 0; i < bank.getClientByName("Fedor").getAccounts().length; i++) {
			System.out.println(bank.getClientByName("Fedor").getAccounts()[i]);
		}
		
		System.out.println(bank.getClientByName("Fedor").getTotalSum());
		
		System.out.println(bank.getClientByName("Vitaliy").getAccountByName("Ricardo"));
	}

}
