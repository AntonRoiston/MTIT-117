package twinroom;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class TwinRoomActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Twin Room Booking Service Started");
		TwinRoomPublish busPublish = new TwinRoomPublishImpl();
		serviceRegistration = bundleContext.registerService(TwinRoomPublish.class.getName(), busPublish, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Twin Room Booking Service Stop");
		serviceRegistration.unregister();
	}

}
