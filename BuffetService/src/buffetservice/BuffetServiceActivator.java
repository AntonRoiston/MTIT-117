package buffetservice;

import bufferinfopublisher.BuffetInfoPublish;
import bufferinfopublisher.BuffetInfoPublishImpl;
import buffetpublisher.BuffetPublish;
import java.util.Hashtable;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;
import org.osgi.framework.ServiceReference;
import org.osgi.util.tracker.ServiceTracker;



public class BuffetServiceActivator implements BundleActivator, ServiceListener {

	ServiceReference serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
System.out.println("Consumer Started");
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Welcome to the Buffet Booking Page !!!!!");
		System.out.print("Enter Your Full Name: ");
		String Fname = scn.nextLine();
		
		System.out.println("1. Buffet information \n2. Buffet Booking");
		System.out.print("Please Select a option (1/2) : ");
		int roomType = scn.nextInt();
		switch(roomType) {
//			case 1:
//				serviceReference = bundleContext.getServiceReference(BuffetInfoPublish.class.getName());
//				BuffetInfoPublish buffetinfopublish = (BuffetInfoPublish)bundleContext.getService(serviceReference);
//				buffetinfopublish.BuffetInfoReserveHandle(Fname);
//		        break;
			case 2:
				serviceReference = bundleContext.getServiceReference(BuffetPublish.class.getName());
				BuffetPublish buffetpublish = (BuffetPublish)bundleContext.getService(serviceReference);
				buffetpublish.BuffetReserveHandle(Fname);
		     break;
			        

		}
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Consumer Stoped");
		bundleContext.ungetService(serviceReference);
	}

	@Override
	public void serviceChanged(ServiceEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}
