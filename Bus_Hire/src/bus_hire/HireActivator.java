package bus_hire;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class HireActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		System.out.println("Bus Hire Service Started");
		HirePublish hirePublish = new HirePublishImpl();
		serviceRegistration = context.registerService(HirePublish.class.getName(), hirePublish, null);
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Bus Hire service stop");
		serviceRegistration.unregister();
	}
	
}
