package room_consumer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import singleroom.SingleRoomPublish;
import superiorroom.SuperiorRoomPublish;
import twinroom.TwinRoomPublish;

public class RoomConsumerActivator implements BundleActivator {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Consumer Started");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("!!!!! Welcome to the Room Booking Service !!!!!");
		System.out.print("Enter Your Full Name:");
		String Fname = scn.nextLine();
		System.out.println("1. Single Room\n2. Deluxe King Room\n3. Twin Room\n4. Superior Room");
		System.out.print("Please Select the Room Type: ");
		int room_Type = scn.nextInt();
		switch(room_Type) {
			case 1:
					serviceReference = bundleContext.getServiceReference(SingleRoomPublish.class.getName());
					SingleRoomPublish singleroompublish = (SingleRoomPublish)bundleContext.getService(serviceReference);
					singleroompublish.SingleRoomReserveHandle(Fname);
			        break;
			        
//			case 2:
//					serviceReference = bundleContext.getServiceReference(SuperiorRoomPublish.class.getName());
//					SuperiorRoomPublish superiorroompublish = (SuperiorRoomPublish)bundleContext.getService(serviceReference);
//					superiorroompublish.SuperiorRoomReserveHandle(Fname);
//					break;
			case 3:
					serviceReference = bundleContext.getServiceReference(TwinRoomPublish.class.getName());
					TwinRoomPublish twinRoomPublish = (TwinRoomPublish)bundleContext.getService(serviceReference);
					twinRoomPublish.TwinRoomReserveHandle(Fname);
					break;
			case 4: 
					serviceReference = bundleContext.getServiceReference(SuperiorRoomPublish.class.getName());
					SuperiorRoomPublish superiorroompublish = (SuperiorRoomPublish)bundleContext.getService(serviceReference);
					superiorroompublish.SuperiorRoomReserveHandle(Fname);
					break;
			
		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Consumer Stoped");
		bundleContext.ungetService(serviceReference);
	}

}
