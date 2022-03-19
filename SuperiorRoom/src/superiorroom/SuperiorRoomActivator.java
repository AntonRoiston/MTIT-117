package superiorroom;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class SuperiorRoomActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Superior Room Booking Service Started !!!");
		SuperiorRoomPublish superiorroompublish = new SuperiorRoomPublishImpl();
		serviceRegistration = bundleContext.registerService(SuperiorRoomPublish.class.getName(), superiorroompublish, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Superior Room Booking service stop !!!");
		serviceRegistration.unregister();
	}

}
