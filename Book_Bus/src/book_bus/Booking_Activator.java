package book_bus;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Booking_Activator implements BundleActivator {


	ServiceRegistration serviceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Bus Booking Service Started");
		BookingPublish bookingPublish = new BookingPublishImpl();
		serviceRegistration = context.registerService(BookingPublish.class.getName(), bookingPublish, null);
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bus Booking Service Stop");
		serviceRegistration.unregister();
		
	}

}