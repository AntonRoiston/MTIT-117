package twinroom;

import java.util.Scanner;

public class TwinRoomPublishImpl implements TwinRoomPublish {
	
	private final int AcRoomPerDay = 5000;
	private final int Non_AcRoomPerDay = 4000;
	
	private int RoomType;
	private int numOfDays;
	private double totalBill;

	
		public void TwinRoomReserveHandle(String Fname) {
			
				Scanner scan = new Scanner(System.in);
				
					System.out.println("\n====ROOM BOOKING====");
					System.out.print("Get 15% off for more than 15 days booking!! \n:");
					System.out.print("Get 5% off for more than 7 days booking!! \n:");
					System.out.print("Enter number of Days:");
					numOfDays = scan.nextInt();
					System.out.println("Select Room type\n 1. A/C Room \n 2. Non A/C Room");
					System.out.print("Enter TwinRoom Type:");
					RoomType = scan.nextInt();
					

					totalBill = calculatetotalbill(RoomType,numOfDays);
					System.out.println("\n-----Your Bill-----");
					System.out.println("Full Name: " + Fname);
					
					System.out.println("Your Totall Bill Amount is: Rs." + totalBill);
					System.out.println("!!!Wear Mask and Stay Safe!!!Thank you for the Reservation!!!");
					
					
}


		private double calculatetotalbill(int RoomType, int numOfDays) {
			
			
				double r = 0;
				if (numOfDays > 14) {
				if(RoomType == 1) {
					
						r = (AcRoomPerDay * numOfDays);
					
				}
				else if (RoomType == 2) {
					
						r = (Non_AcRoomPerDay * numOfDays);
					
				}
				else {
					System.out.println("INVALID ROOM TYPE!");
				}
				
				r = r - (r * 15 / 100);
				
				}
				
				else if (numOfDays > 7) {

					if(RoomType == 1) {
						
							r = (AcRoomPerDay * numOfDays);
						
					}
					else if (RoomType == 2) {
						
							r = (Non_AcRoomPerDay * numOfDays);
						
					}
					else {
						System.out.println("INVALID ROOM TYPE!");
					}
					
					r = r - (r * 5 / 100);				
					
				}
				else {
					if(RoomType == 1) {
						
						r = (AcRoomPerDay * numOfDays);
					
				}
				else if (RoomType == 2) {
					
						r = (Non_AcRoomPerDay * numOfDays);
					
				}
				else {
					System.out.println("INVALID ROOM TYPE!");
				}
				}
				return r;
				
		}


		


}
