package by.epam.aggregationAndComposition.task5;

/* Туристические путевки. Сформировать набор предложений клиенту по выбору
   туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.)
   для оптимального выбора. Учитывать возможность выбора транспорта, питания и числа дней.
   Реализовать выбор и сортировку путевок. */

public class Main {

	public static void main(String[] args) {
		TouristAgency touristAgency = new TouristAgency("SpainTours");
		touristAgency.addClient(new Client("Vitaliy"));
		touristAgency.getClientByName("Vitaliy").addTour(new Tour("Shopping", "bus", true, 5));
		touristAgency.getClientByName("Vitaliy").sort();
		
		for (int i = 0; i < touristAgency.getClientByName("Vitaliy").getTours().length; i++) {
			System.out.println(touristAgency.getClientByName("Vitaliy").getTours()[i]);
		}
		
	}

}
