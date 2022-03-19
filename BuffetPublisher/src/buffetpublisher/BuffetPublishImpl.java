package buffetpublisher;
import java.util.Scanner;

public class BuffetPublishImpl implements BuffetPublish {
	
	private final int BreakfastBuffetWD = 3000;
	private final int LunchBuffetWD = 2000;
	private final int HighTeaBuffetWD = 2000;
	private final int DinnerBuffetWD = 3000;
	private final int BreakfastBuffetWE = 4000;
	private final int LunchBuffetWE = 3000;
	private final int HighTeaBuffetWE = 3000;
	private final int DinnerBuffetWE = 4000;
	private int BuffetType;
	private int DayType;
	private String Date;	 
	private double totalBill;


		public void BuffetReserveHandle(String Fname) {
			
				Scanner scan = new Scanner(System.in);
				
					System.out.println("\n====Buffet Booking====");
					System.out.println("Select Buffet Type \n 1. Breakfast \n 2. Lunch \n 3. Hightea \n 4. Dinner");
					System.out.print("Enter buffet Type (1/2/3/4): ");
					BuffetType = scan.nextInt();
					System.out.print("Enter Day type (1. Weekday / 2. Weekend) : ");
					DayType = scan.nextInt();
					System.out.print("Enter Booking Date (DD/MM/YYYY) ");
					Date = scan.next();
					

					totalBill = calculatetotalbill(BuffetType,DayType);
					System.out.println("\n-----Your Booking Receipt-----");
					System.out.println("Name: " + Fname);
					System.out.println("Your Totall Bill is: Rs." + totalBill);
					System.out.println("\n !!!Wear Mask and Stay Safe!!!");
					System.out.println("Thank you for Booking!!!");
					System.out.println("Have a Great Day");
}


		private double calculatetotalbill(int RoomType, int numOfDays) {			
				double r = 0;
				if(DayType == 1) {
					
						if(BuffetType == 1) {
							r = BreakfastBuffetWD;
						}
						else if (BuffetType == 2) {
							r = LunchBuffetWD;
						}
						else if (BuffetType == 3) {
							r = HighTeaBuffetWD;
						}
						else if (BuffetType == 4) {
							r = DinnerBuffetWD;
						}
						else {
							System.out.println("INVALID BUFFET TYPE!");
						}
					
				}
				else if (DayType == 2) {
							
					if(BuffetType == 1) {
						r = BreakfastBuffetWE;
					}
					else if (BuffetType == 2) {
						r = LunchBuffetWE;
					}
					else if (BuffetType == 3) {
						r = HighTeaBuffetWE;
					}
					else if (BuffetType == 4) {
						r = DinnerBuffetWE;
					}
					else {
						System.out.println("INVALID BUFFET TYPE!");
					}					
				}
			   else {
					System.out.println("INVALID DAY TYPE!");
				}
				
				return r;
		}
	
}
