package superiorroom;

import java.util.Scanner;

public class SuperiorRoomPublishImpl implements SuperiorRoomPublish {
	
	private final int withBalconyRoomPerHour = 1000;
	private final int WithoutBalconyRoomPerHour = 750;
	
	private int roomType;
	private int package_Number;
	 
	private double totalBill;

	
	@Override
	public void SuperiorRoomReserveHandle(String Fname) {
		
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("\n\t=====Room Booking=====");
		System.out.print("Select Room Type:-  1.With Balcony    2.Without Balcony:");
		roomType = scn.nextInt();
		System.out.println("===============================");
		System.out.println("Package 01 - (Normal Board - 5 hours)\nPackage 02 - (Half Board - 12 hours)\nPackage 03 - (Full Board - 24 hours)");
		System.out.println("===============================");

		System.out.print("Select Package Number:");
		package_Number = scn.nextInt();
		
		totalBill = SuperiorRoomBillCalculate(roomType, package_Number);
		System.out.println("\n-----Your Bill-----");
		System.out.println("Full Name: " + Fname);
		System.out.println("Your Total Bill Amount is: Rs." + totalBill);
		System.out.println("Thank you for the Reservation!!!");
		
	}

private double SuperiorRoomBillCalculate(int roomType, int package_Number) {
	
	
	double totalB = 0;
	if(roomType == 1) {
		
		switch(package_Number) {
			case 1: 
				totalB = (withBalconyRoomPerHour * 5);
				break;
			case 2:
				totalB = (withBalconyRoomPerHour * 10);
				break;
			case 3:
				totalB = (withBalconyRoomPerHour * 15);
				break;
		}
		
	}else if(roomType == 2) {
		switch(package_Number) {
		case 1: 
			totalB = (WithoutBalconyRoomPerHour * 5);
			break;
		case 2:
			totalB = (WithoutBalconyRoomPerHour * 10);
			break;
		case 3:
			totalB = (WithoutBalconyRoomPerHour * 15);
			break;
	}
	}
	return totalB;
}




	

}
