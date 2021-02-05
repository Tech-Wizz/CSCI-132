package christensen_lab7;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {

		DoublyLinkedList<String> airports = new DoublyLinkedList<>();
		
		System.out.println("Add Airports: LAX SFO SLC BOS BZM");
		airports.add("LAX");
		airports.add("SFO");
		airports.add("SLC");
		airports.add("BOS");
		airports.add("BZN");

		System.out.println(airports.toString());
		
		System.out.println("Add Airport GTF at index 2:");
		airports.add(2, "GTF");
		System.out.println(airports.toString());
		
		System.out.println("Add Airport GTF at index 8:");
		try {
		airports.set(8, "GTF");
		}catch (NullPointerException e) {
			System.out.println("Index out of range.");
		}
		System.out.println(airports.toString());

		System.out.println("Clear the list:");
		airports.clear();
		System.out.println(airports.toString());
		
		System.out.println("Add ORD SAN DWI ATL get index 3:");
		airports.add("ORD");
		airports.add("SAN");
		airports.add("DWI");
		airports.add("ATL");
		System.out.println("Airport is " + airports.get(3));
		
		try {
		System.out.println("Airport is " + airports.get(6));
		}catch (NullPointerException e) {
			System.out.println("Index out of range.");
			System.out.println("value is null");
		}
		
		System.out.println("Set index 2 to GTF:");
		airports.set(2, "GTF");
		System.out.println(airports.toString());
		
		try {
		System.out.println("Set index 7 to BTH:");
		airports.set(7, "BTH");
		System.out.println(airports.toString());
		}catch (NullPointerException e) {
			System.out.println("Index out of range.");
		}
		System.out.println(airports.toString());
	}
}
