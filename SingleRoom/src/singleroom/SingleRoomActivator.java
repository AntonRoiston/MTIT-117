package singleroom;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class SingleRoomActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Single Room Booking Service Started !!!");
		SingleRoomPublish publisherservice = new SingleRoomPublishImpl();
		serviceRegistration = bundleContext.registerService(SingleRoomPublish.class.getName(), publisherservice, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Single Room Booking service stop !!!");
		serviceRegistration.unregister();
	}

}
