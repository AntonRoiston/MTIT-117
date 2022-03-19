package bus_hire;

import java.util.Scanner;

public class HirePublishImpl implements HirePublish {
		
		private final int normal = 900;
		private final int semiLuxury = 1500;
		private final int luxury = 2100;
		
		private final double minHours = 0.55;
		private final double maxHours = 0.75;
		
		private final double smallTrip = 0.85;
		private final double bigTrip = 0.65;

		private int type;
		private int noofDays;
		private int hours;
		private double totalbill;		        	


			public void BikeReserveHandle(String name) {
				
					Scanner sc = new Scanner(System.in);
					
						System.out.println("\n----HIRE BUS FOR TRIP----");
						System.out.println("Select Bus Type:\n 1. Normal\n 2. Semi Luxury\n 3. Luxury ");
						System.out.print("Select Bus Type:");
						type = sc.nextInt();
						System.out.println("--------------------------");
						System.out.print("Enter number of Days:");
						noofDays = sc.nextInt();
						System.out.println("--------------------------");
						System.out.print("Enter hours in a day:");
						hours = sc.nextInt();
						System.out.println("--------------------------");

						totalbill = calculatetotalbill(type,noofDays, hours);
						System.out.println("\n=======Your Bill======");
						System.out.println("Name: " + name);
						System.out.println("Total Days: " + noofDays);
						System.out.println("Hours per Day: " + hours);
						System.out.println("Your Bill Amount is: Rs." + totalbill);
						System.out.println("!!!Wear Mask =[]=");
						System.out.println("**Thank you for Reservation!!!**");
						System.out.println("---Have a Safe Journey---");
}


			private double calculatetotalbill(int type, int noofDays, int hours) {
				// TODO Auto-generated method stub
					
					double t = 0;
					if(type == 1) {
						if(noofDays <=15 ) {
							if(hours <= 12) {
								t = (minHours * hours * smallTrip * noofDays * normal );
							}
							else {
								t = (minHours * hours * bigTrip * noofDays * normal );
							}
						}
						else {
							if(hours <= 12) {
								t = (maxHours * hours * smallTrip * noofDays * normal );
							}
							else {
								t = (maxHours * hours * bigTrip * noofDays * normal );
							}
						}
					}
					else if (type == 2) {
						if(noofDays <=15 ) {
							if(hours <= 12) {
								t = (minHours * hours * smallTrip * noofDays * semiLuxury );
							}
							else {
								t = (minHours * hours * bigTrip * noofDays * semiLuxury );
							}
						}
						else {
							if(hours <= 12) {
								t = (maxHours * hours * smallTrip * noofDays * semiLuxury );
							}
							else {
								t = (maxHours * hours * bigTrip * noofDays * semiLuxury );
							}
						}
					}
					else if (type == 3) {
						if(noofDays <=15 ) {
							if(hours <= 12) {
								t = (minHours * hours * smallTrip * noofDays * luxury );
							}
							else {
								t = (minHours * hours * bigTrip * noofDays * luxury );
							}
						}
						else {
							if(hours <= 12) {
								t = (maxHours * hours * smallTrip * noofDays * luxury );
							}
							else {
								t = (maxHours * hours * bigTrip * noofDays * luxury );
							}
						}
					}

					return t;
			}

}