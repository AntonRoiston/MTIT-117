package singleroom;

import java.util.Scanner;

public class SingleRoomPublishImpl implements SingleRoomPublish {
	
	
	private final int a_cRoomPerDay = 3000;
	private final int Non_a_cRoomPerDay = 2000;
	
	private int RoomType;
	private int numOfDays;
	 
	private double totalBill;


		public void SingleRoomReserveHandle(String Fname) {
			
				Scanner scan = new Scanner(System.in);
				
					System.out.println("\n====ROOM BOOKING====");
					System.out.println("Select Room type\n 1. A/C Room \n 2. Non A/C Room");
					System.out.print("Enter Single Room Type:");
					RoomType = scan.nextInt();
					System.out.print("Enter number of Days:");
					numOfDays = scan.nextInt();
					

					totalBill = calculatetotalbill(RoomType,numOfDays);
					System.out.println("\n-----Your Bill-----");
					System.out.println("Name: " + Fname);
					System.out.println("Your Totall Bill Amount is: Rs." + totalBill);
					System.out.println("!!!Wear Mask and Stay Safe!!!");
					System.out.println("Thank you for Reservation!!!");
					System.out.println("Have a Great Journey!!!");
}


		private double calculatetotalbill(int RoomType, int numOfDays) {
			
			
				double r = 0;
				if(RoomType == 1) {
					
						r = (a_cRoomPerDay * numOfDays);
					
				}
				else if (RoomType == 2) {
					
						r = (Non_a_cRoomPerDay * numOfDays);
					
				}
				else {
					System.out.println("INVALID ROOM TYPE!");
				}

				return r;
		}
	
	
	
	

}
