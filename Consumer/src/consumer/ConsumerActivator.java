package consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

import book_bus.BookingPublish;
import bus_hire.HirePublish;


public class ConsumerActivator implements BundleActivator {
	
	ServiceReference serviceReference;

	public void start(BundleContext context) throws Exception {
		System.out.println("Consumer Started");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====Welcome to the Bus Booking Service=====");
		System.out.print("Enter Customer's Name:");
		String name = sc.nextLine();
		System.out.println("1. HIRE BUS\n2. BOOK TICKET");
		System.out.print("Please Select the Service Type: ");
		int vehicleType = sc.nextInt();
		switch(vehicleType) {
			case 1:
					serviceReference = context.getServiceReference(HirePublish.class.getName());
					HirePublish hirePublish = (HirePublish)context.getService(serviceReference);
					hirePublish.BikeReserveHandle(name);
			        break;
			        
			case 2:
					serviceReference = context.getServiceReference(BookingPublish.class.getName());
					BookingPublish bookingPublish = (BookingPublish)context.getService(serviceReference);
					bookingPublish.backhoeReserveHandle(name);
					break;
			
			default:
				System.out.println("Select Valid Service");
		}
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Operation Stoped");
		context.ungetService(serviceReference);
		
		
	}

}



