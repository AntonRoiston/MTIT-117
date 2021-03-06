package book_bus;

import java.util.Scanner;

public class BookingPublishImpl implements BookingPublish {

	private final int normal = 2;
	private final int semiLuxury = 3;
	private final int luxury = 2100;
	
	private int busType;
	private int tripNum;
	private int fullTicket;
	private int halfTicket;
	private double totalBalance;
	
	public void backhoeReserveHandle(String name) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n\t----BOOK TICKET----");
		System.out.print("1. Normal Bus \n2. Semi Luxury Bus \n3. Luxury Bus");
		System.out.println("\n--------------------------");
		System.out.print("Select Bus Type:");
		busType = sc.nextInt();
		System.out.println("--------------------------");
		System.out.println("1. Colombo-Kandy \n2. Colombo-Galle \n3. Colombo-Mannar \n4. Colombo-Jaffna");
		System.out.println("\n--------------------------");
		System.out.print("Select Route:");
		tripNum = sc.nextInt();
		System.out.println("--------------------------");
		System.out.print("Full Ticket Count:");
		fullTicket = sc.nextInt();
		System.out.println("--------------------------");
		System.out.print("Half Ticket Count(<12years):");
		halfTicket = sc.nextInt();
		System.out.println("--------------------------");
		
		totalBalance = backhoeBalanceCalculate(busType, tripNum, fullTicket, halfTicket);
		System.out.println("\n=======Your Bill======");
		System.out.println("Name: " + name);
		System.out.println("Full Ticket = " + fullTicket);
		System.out.println("Half Ticket = " + halfTicket);
		System.out.println("Your Balance is = Rs." + totalBalance);
		System.out.println("\t!!!Wear Mask =[]=");
		System.out.println("\t**Thank you for Reservation!!!**");
		System.out.println("\t---Have a Safe Journey---");
		
	}
	
	private double backhoeBalanceCalculate(int busType,int tripNum,int fullTicket, int halfTicket) {
		double total = 0;
		if(busType == 1) {
			switch(tripNum) {
				case 1: 
					total = ((fullTicket + halfTicket/2)* normal * 145);
					break;
				case 2:
					total = ((fullTicket + halfTicket/2)* normal * 150);
					break;
				case 3:
					total = ((fullTicket + halfTicket/2)* normal * 260);
					break;
				case 4:
					total = ((fullTicket + halfTicket/2)* normal * 410);
					break;
			}
			
		}
		else if(busType == 2) {
			switch(tripNum) {
			case 1: 
				total = ((fullTicket + halfTicket/2)* semiLuxury * 145);
				break;
			case 2:
				total = ((fullTicket + halfTicket/2)* semiLuxury * 150);
				break;
			case 3:
				total = ((fullTicket + halfTicket/2)* semiLuxury * 260);
				break;
			case 4:
				total = ((fullTicket + halfTicket/2)* semiLuxury * 410);
				break;
			}
		}
		else if(busType == 3) {
			switch(tripNum) {
			case 1: 
				total = ((fullTicket + halfTicket/2)* luxury * 145);
				break;
			case 2:
				total = ((fullTicket + halfTicket/2)* luxury * 150);
				break;
			case 3:
				total = ((fullTicket + halfTicket/2)* luxury * 260);
				break;
			case 4:
				total = ((fullTicket + halfTicket/2)* luxury * 410);
				break;
			}
		}
		return total;
	}
}