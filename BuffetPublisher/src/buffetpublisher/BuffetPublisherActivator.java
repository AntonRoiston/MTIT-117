package buffetpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class BuffetPublisherActivator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Buffet booking publisher Started !!!");
		BuffetPublish publisherservice = new BuffetPublishImpl();
		serviceRegistration = bundleContext.registerService(BuffetPublish.class.getName(), publisherservice, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Buffet booking publisher stop !!!");
		serviceRegistration.unregister();
	}

}
