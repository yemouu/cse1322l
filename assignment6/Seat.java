/*
Class:       CSE 1322L
Section:     J03
Term:        Fall 2021
Instructor:  Kendrick, Kaleigh
Name:        Kofi Hannam
Assignment#: 6
*/

// 2021-09-27
// 2021-09-28

public abstract class Seat {
	private int baseTicketPrice;
	private int carryOn;
	private int firstBagCost;
	private int secondBagCost;
	private int additionalBagCost;
	private Passenger passenger;
	private int totalPriceOfSeat;

	public Seat(Passenger passenger, String ticketType) {
		this.passenger = passenger;

		switch(ticketType) {
			case "First":
				baseTicketPrice = 1000;
				carryOn = firstBagCost = secondBagCost = additionalBagCost = 0;
				break;
			case "Business":
				baseTicketPrice = 750;
				additionalBagCost = 50;
				carryOn = firstBagCost = secondBagCost = 0;
				break;
			case "Economy":
				baseTicketPrice = 400;
				secondBagCost = additionalBagCost = 50;
				carryOn = firstBagCost = 0;
				break;
			case "Basic Economy":
				baseTicketPrice = 200;
				carryOn = firstBagCost = 50;
				secondBagCost = additionalBagCost = 100;
				break;
		}

		totalPriceOfSeat = baseTicketPrice + (passenger.carryOnBags * carryOn);
		for (int i = 0; i < passenger.checkedBags; i++) {
			if (i == 0) totalPriceOfSeat += firstBagCost;
			else if (i == 1) totalPriceOfSeat += secondBagCost;
			else totalPriceOfSeat += additionalBagCost;
		}
	}

	@Override
	public String toString() {
		return passenger.toString() + " and paid $" + totalPriceOfSeat;
	}
}
