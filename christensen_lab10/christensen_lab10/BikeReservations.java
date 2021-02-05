package christensen_lab10;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class BikeReservations {
	// Fields

		final static int NUMBIKES = 5;

		// Constructor

		public BikeReservations() {

			Scanner input = new Scanner(System.in);
			String menuChoice = "";
			String firstName, lastName;
			double hoursRented;
			int bikeIndex;
			int check = 0;
			BikeRental newBike;
			ArrayList<BikeRental> bikeListing = new ArrayList<>();

			// Initialize the ArrayList by adding all NUMBIKES bikes
			this.addBikes(bikeListing);

			// Introductory Message
			System.out.println("*** Welcome Valued Employee! ***\n");
			System.out.println("We currently have " + NUMBIKES + " bikes available for rent.");
			System.out.println("Remember, bikes are numbered begining with zero.");
			System.out.println("Please wash hands after every transaction.");
			System.out.println("Safty is everyone's responsibility. --Mgmt");

			// User Menu
			while (!menuChoice.equals("Q")) {
				System.out.println();
				System.out.print("(A)vailability, (L)isting, (R)eserve Bike, (C)heck In, or (Q)uit > ");
				menuChoice = input.next().toUpperCase();

				if (menuChoice.equals("A"))
					this.bikeSelection(bikeListing);
				else if (menuChoice.equals("L")) {
					
					// TODO: 1. Implement the printBikeListing() method (below)
					
					printBikeListing(bikeListing);
				} 
				else if (menuChoice.equals("R")) {
					int c = 0;
					try {
					System.out.print("Bike Number: ");
					while(!input.hasNextInt()) {
						input.next();
						System.out.println("Please enter a valid integer.");
					}
					// TODO: 2. Ensure user enters an integer (See textbook p 40)
					// Hint: There is an example of capturing a double a few line down...
					check = input.nextInt();
					if(!bikeListing.get(check).isAvailable()) {
						System.out.println("Sorry, that bike is already out.");
						c = 1;
					}
					}catch(IndexOutOfBoundsException e) {
						System.out.println("Sorry, that bike doesn't exsist ");
						System.out.println("Choose a number between 0 and 4");
						c = 1;
					}
					if (!(c==1)) {
						bikeIndex = check;
					// TODO: 3. Allow this reservation only a if requested bike is available.
					// Otherwise issue a message that the bike is already checked out.
					// Hint: An if statement should do the trick. 
					// (see ArrayList API: get(), BikeRental API: isAvailable())

					// TODO: 4. Handle IndexOutOfBoundsException (see lab 5, textbook p 82)
					// Hint: what happens if you try to reserve a bike beyond NUMBIKES?

						System.out.print("First name: ");
						firstName = input.next();
						System.out.print("Last name: ");
						lastName = input.next();
						System.out.print("Hours rented: ");
					
					// Ensure user enters an double
						while (!input.hasNextDouble()) { 
							input.next();
							System.out.println("Enter hours");
						}
						hoursRented = input.nextDouble();

						newBike = new BikeRental();
						newBike.checkBikeOut(firstName, lastName, hoursRented);
						bikeListing.set(bikeIndex, newBike);
						System.out.println("Reservation Complete.");
					}

				} else if (menuChoice.equals("C")) {
					System.out.println("Bikes rented: " + BikeRental.getNumRented());
					if(BikeRental.getNumRented()>0) {
						try {
							System.out.print("Bike Number: ");
							while(!input.hasNextInt()) {
								input.next();
								System.out.println("Please enter a valid integer.");
							}						
							check = input.nextInt();
							if(bikeListing.get(check).isAvailable()) {
								System.out.println("Sorry, that bike is already in.");
							}
							if(!bikeListing.get(check).isAvailable()) {
								bikeIndex = check;
								bikeListing.get(bikeIndex).checkBikeIn();
								System.out.println("Bike " + bikeIndex + " checked in.");
							}
						}catch(IndexOutOfBoundsException e) {
							System.out.println("Sorry, that bike doesn't exsist ");
						}
					}else {
						System.out.println("No bikes are checked out");
					}
					

					// TODO: 5. 
					// a. Ask user for the bike index to be checked in,
					// then check bike in and make it available.
					// b. If no bikes are out, say so, and get out of this option
					// d. Prompt user if the bike they specify is already in.
					// c. Don't accept bad input (anything other than an int)
					// e. Handle exception if user enters an index out of range
					

				} 
				else if (menuChoice.equals("Q")) {
					System.out.println("<end>");
				} 
				else {
					System.out.println("Choose P, C, R, or Q");
				}
			}
			input.close();
		}
		// Methods

		public void addBikes(ArrayList<BikeRental> bikes) {
			for (int i = 0; i < NUMBIKES; ++i) {
				bikes.add(new BikeRental());
			}
		}

		public void bikeSelection(ArrayList<BikeRental> bikes) {
			for (int i = 0; i < bikes.size(); ++i) {
				if (bikes.get(i).isAvailable())
					System.out.println("Bike " + i + " is available for rent.");
			}
		}

		public void printBikeListing(ArrayList<BikeRental> bikes) {
			System.out.println("Bike	First	Last	Hours");
			for (int i = 0; i < bikes.size(); ++i) {
				System.out.println(i + "\t" + bikes.get(i).getFirstName() + "\t" + bikes.get(i).getLastName() + "\t" + bikes.get(i).getHoursRented());
			}
			
			// FIXME: Print the reservation data for each bike
			// Hint: see methods above that take the bike ArrayList as parameters
			// Notice also that there is printReseveration() method in the BikeRental API

		}

		public static void main(String[] args) {

			new BikeReservations();
		}

}
