package servicesubscriber;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
//import org.osgi.framework.ServiceRegistration;
import servicepublisher.ServicePublish;


public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext bundleContext) throws Exception {
		//ServiceActivator.context = bundleContext;
		System.out.println("Start Subscriber Service");
		//serviceReference publisherService = new ServicePublishImpl();
		serviceReference = bundleContext.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish) bundleContext.getService(serviceReference);
		System.out.println(servicePublish.publishService());
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		//ServiceActivator.context = null;
		
		System.out.println("Good Bye !!!");
		bundleContext.ungetService(serviceReference);
	}

}
